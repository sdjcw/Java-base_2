package serial.conditions;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	static final String OUT_FILE = "src/serial/conditions/temp.out";

	public static void main(String[] args) throws IOException {
		User user = new User("����");

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject(user);
		out.close();
		
		// ʹ��java-io_2-deserialzation��Ŀ��serial.conditions.DeserializationExample���Է����л�
	}

}
