package loaderclass;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException {
		// ʹ�� -verbose�������Կ�����ϸ������ع���
		System.out.println("\n׼��ʵ����Cat");
		Cat cat = new Cat();
		System.out.println("Catʵ�������");
		
		System.out.println("\n׼������loaderclass.MyTest��");
		Class.forName("loaderclass.MyTest");
		System.out.println("�ڶ��ε���Class.forname()");
		Class.forName("loaderclass.MyTest");

		System.out.println("\n׼������loaderclass.MyTest2��");
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
		System.out.println("MyTest2�ľ�̬���ֳ�ʼ��");
	}
}