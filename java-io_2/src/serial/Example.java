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
		User user = new User(3, "����");
		Item item = new Item(2, "XX�Ƴ���T��");
		Order order = new Order(9, user, item);

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject("������Ϣ...");
		out.writeObject(order);
		out.close();

		System.out.println("���л���ɣ�����serial.DeserializationExample���Է����л�");
	}

}
