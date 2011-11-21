package serial.serialversionuid;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public final String name;
	
	public int age = 18;
	
	public User(String name) {
		System.out.println("������������");
		this.name = name;
	}

}