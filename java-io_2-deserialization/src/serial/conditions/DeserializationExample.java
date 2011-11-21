package serial.conditions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	static final String OUT_FILE = "src/serial/conditions/temp.out";
	
	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(OUT_FILE)));
		Object object = in.readObject();
		
		System.out.println(object);
	}

}
