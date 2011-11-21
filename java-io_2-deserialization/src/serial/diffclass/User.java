package serial.diffclass;

import java.io.Serializable;

public class User implements Serializable {
	public final String name;
	
	private int age;

	public User(String name) {
		this.name = name;
	}

}