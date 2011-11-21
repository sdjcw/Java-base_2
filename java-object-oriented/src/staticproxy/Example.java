package staticproxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		HelloService service = new HelloServiceProxy(new HelloServiceImpl());
		service.hello("张三");
	}

}

interface HelloService {
	void hello(String name);
}

class HelloServiceImpl implements HelloService {
	@Override
	public void hello(String name) {
		System.out.println("Hello, " + name);
	}
}

class HelloServiceProxy implements HelloService {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private HelloService service;

	public HelloServiceProxy(HelloService service) {
		this.service = service;
	}
	
	@Override
	public void hello(String name) {
		logger.log(Level.INFO, "hello method 开始...");
		service.hello(name);
		logger.log(Level.INFO, "hello method 结束...");
	}
	
}
