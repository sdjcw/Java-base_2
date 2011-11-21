package serial.reference;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example2 {

	static final String OUT_FILE_1 = "src/serial/reference/temp1.out";
	static final String OUT_FILE_2 = "src/serial/reference/temp2.out";

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		User user = new User("ÕÅÈý");
		Order order1 = new Order(1, user);
		Order order2 = new Order(2, user);

		ObjectOutputStream out1 = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE_1)));
		out1.writeObject(order1);
		out1.close();

		ObjectOutputStream out2 = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE_2)));
		out2.writeObject(order2);
		out2.close();
	}

}
