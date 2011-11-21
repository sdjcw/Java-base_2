package noise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		HelloService service = new HelloService();
		service.hello("张三");
	}

}

class HelloService {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void hello(String name) {
		logger.log(Level.INFO, "hello method 开始...");
		System.out.println("Hello, " + name);
		logger.log(Level.INFO, "hello method 结束...");
	}
}