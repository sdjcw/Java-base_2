package equals.consistent;

import java.net.MalformedURLException;
import java.net.URL;

public class Example {

	public static void main(String[] args) throws MalformedURLException {
		System.out.println(new URL("http://localhost").equals(new URL(
				"http://127.0.0.1")));
	}

}