package serial;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream(Example.OUT_FILE)));
		String title = (String) in.readObject();
		System.out.println(title);

		Order order = (Order) in.readObject();
		System.out.println("order.id = " + order.getId());
		System.out.println("order.user.id = " + order.getUser().getId());
		System.out.println("order.user.name = " + order.getUser().getName());
		System.out.println("order.item.id = " + order.getItem().getId());
		System.out.println("order.item.name = " + order.getItem().getName());
	}

}
