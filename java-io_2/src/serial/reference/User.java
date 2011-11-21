package serial.reference;

import java.io.Serializable;

public class User implements Serializable {
	public final String name;

	public User(String name) {
		this.name = name;
	}

}