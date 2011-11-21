package classloader.system;

public class Example {

	public static void main(String[] args) {
		ClassLoader cl = Example.class.getClassLoader();
		while (cl != null) {
			System.out.println(cl.toString());
			cl = cl.getParent();
		}
	}

}
