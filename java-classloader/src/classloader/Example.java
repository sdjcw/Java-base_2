package classloader;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader cl1 = Example.class.getClassLoader();

		Example obj = new Example();
		ClassLoader cl2 = obj.getClass().getClassLoader();

		System.out.println("cl1.equals(cl2) ? " + cl1.equals(cl2));

		Class<?> loadClass = cl1.loadClass("classloader.Dog");
	}

}

class Dog {
	static {
		System.out.println("DogµÄ¾²Ì¬¿é³õÊ¼»¯");
	}
}
