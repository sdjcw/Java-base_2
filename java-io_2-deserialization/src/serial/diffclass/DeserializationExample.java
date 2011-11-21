package serial.diffclass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	static final String OUT_FILE = "src/serial/diffclass/temp.out";
	
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(OUT_FILE)));
		User user = (User) in.readObject();
		
		System.out.println(user.name);
	}

}
