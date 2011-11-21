package serial.serialversionuid;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public final String name;
	
	public User(String name) {
		this.name = name;
	}

}