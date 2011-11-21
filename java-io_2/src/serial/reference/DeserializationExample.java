package serial.reference;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(Example.OUT_FILE)));
		Order order1 = (Order) in.readObject();
		Order order2 = (Order) in.readObject();
		
		System.out.println("order1.user == order2.user ? " + (order1.user == order2.user));
		System.out.println("order1.user.equals(order2.user) ? " + (order1.user.equals(order2.user)));
	}

}
