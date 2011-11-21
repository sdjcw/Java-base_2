package serial.diffclass;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example {

	static final String OUT_FILE = "src/serial/diffclass/temp.out";

	public static void main(String[] args) throws IOException {
		User user = new User("уехЩ");

		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(OUT_FILE)));
		out.writeObject(user);
		out.close();
	}

}
