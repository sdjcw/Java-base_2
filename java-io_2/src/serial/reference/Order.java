package serial.reference;

import java.io.Serializable;

public class Order implements Serializable {

	public final int num;
	public final User user;

	public Order(int num, User user) {
		this.num = num;
		this.user = user;
	}

}