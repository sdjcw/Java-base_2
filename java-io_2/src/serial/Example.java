package serial;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	static final String OUT_FILE = "src/serial/temp.out";
	
	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		User user = new User(3, "张三");
		Item item = new Item(2, "XX牌长袖T恤");
		Order order = new Order(9, user, item);

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject("订单信息...");
		out.writeObject(order);
		out.close();

		System.out.println("序列化完成，请在serial.DeserializationExample尝试反序列化");
	}

}
