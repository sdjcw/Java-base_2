package serial.serialversionuid;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	private static final String OUT_FILE = "src/serial/serialversionuid/temp.out";

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {

		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(OUT_FILE)));
		User user = (User) in.readObject();

		System.out.println(user.name);
		System.out.println(user.age);
	}

}
