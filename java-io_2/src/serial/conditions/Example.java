package serial.conditions;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	static final String OUT_FILE = "src/serial/conditions/temp.out";

	public static void main(String[] args) throws IOException {
		User user = new User("张三");

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject(user);
		out.close();
		
		// 使用java-io_2-deserialzation项目的serial.conditions.DeserializationExample尝试反序列化
	}

}
