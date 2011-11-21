package serial.reference;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample2 {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		
		ObjectInputStream in1 = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(Example2.OUT_FILE_1)));
		Order order1 = (Order) in1.readObject();
		
		ObjectInputStream in2 = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(Example2.OUT_FILE_2)));
		Order order2 = (Order) in2.readObject();
		
		System.out.println("order1.user == order2.user ? " + (order1.user == order2.user));
		System.out.println("order1.user.equals(order2.user) ? " + (order1.user.equals(order2.user)));
	}

}
