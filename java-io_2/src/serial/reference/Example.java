package serial.reference;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	static final String OUT_FILE = "src/serial/reference/temp.out";

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		User user = new User("уехЩ");
		Order order1 = new Order(1, user);
		Order order2 = new Order(2, user);

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject(order1);
		out.writeObject(order2);
		out.close();
	}

}
