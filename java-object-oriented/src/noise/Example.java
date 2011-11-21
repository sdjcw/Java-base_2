package noise;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example {

	public static void main(String[] args) {
		HelloService service = new HelloService();
		service.hello("����");
	}

}

class HelloService {
	private Logger logger = Logger.getLogger(this.getClass().getName());

	public void hello(String name) {
		logger.log(Level.INFO, "hello method ��ʼ...");
		System.out.println("Hello, " + name);
		logger.log(Level.INFO, "hello method ����...");
	}
}