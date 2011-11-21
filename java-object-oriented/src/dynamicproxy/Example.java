package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		HelloService service = (HelloService) LogHandler
				.createProxy(new HelloServiceImpl());
		service.hello("张三");
		service.bye("李四");
	}

}

interface HelloService {
	void hello(String name);

	void bye(String name);
}

class HelloServiceImpl implements HelloService {
	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name);
	}

	@Override
	public void bye(String name) {
		System.out.println("Bye, " + name);
	}
}

class LogHandler implements InvocationHandler {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;

	private LogHandler(Object delegate) {
		this.delegate = delegate;
	}

	public static Object createProxy(Object delegate) {
		return Proxy.newProxyInstance( //
				delegate.getClass().getClassLoader(), //
				delegate.getClass().getInterfaces(), //
				new LogHandler(delegate));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try {
			logger.log(Level.INFO, method + "开始...");
			Object result = method.invoke(delegate, args);
			logger.log(Level.INFO, method + "结束...");
			return result;
		} catch (Exception e) {
			logger.log(Level.WARNING, "Error: " + e.getMessage());
			throw e;
		}
	}

}