package loaderclass;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		// 使用 -verbose参数可以看到详细的类加载过程
		System.out.println("\n准备实例化Cat");
		Cat cat = new Cat();
		System.out.println("Cat实例化完成");
		
		System.out.println("\n准备加载loaderclass.MyTest类");
		Class.forName("loaderclass.MyTest");
		System.out.println("第二次调用Class.forname()");
		Class.forName("loaderclass.MyTest");

		System.out.println("\n准备加载loaderclass.MyTest2类");
		Class.forName("loaderclass.MyTest2");
	}

}

class Animal {
}

class Cat extends Animal {
}

class MyTest {
}

class MyTest2 {
	static {
		System.out.println("MyTest2的静态部分初始化");
	}
}