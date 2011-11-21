package classobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		Class<?> lcdTVClass = null;
		try {
			lcdTVClass = Class.forName("classobject.LcdTV");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("������" + lcdTVClass.getName());
		System.out.println(lcdTVClass.getName() + "��һ���ӿ��� " + lcdTVClass.isInterface());
		
		Class<?> superclass = lcdTVClass.getSuperclass();
		System.out.println(lcdTVClass.getName() + "�ĸ��ࣿ " + superclass);
		
		System.out.println(lcdTVClass.getName() + "ʵ���˽ӿ� :");
		Class<?>[] interfaces = lcdTVClass.getInterfaces();
		for (Class i : interfaces) {
			System.out.println("  " + i);
		}
		
		Object instance = null;
		try {
			instance = lcdTVClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println("ʹ��newInstance()��������" + instance);
		
		Constructor<?>[] constructors = lcdTVClass.getConstructors();
		for (Constructor con : constructors) {
			System.out.print(lcdTVClass.getName() + "�Ĺ�������" + con);
			Class[] parameterTypes = con.getParameterTypes();
			System.out.println("  �������ͣ�" + Arrays.toString(parameterTypes));
		}
		
		Object instance2 = null;
		try {
			Constructor<?> con = lcdTVClass.getConstructor(int.class);
			instance2 = con.newInstance(54);
			System.out.println("ʹ�ù�����" + con + "��������" + instance2);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		Method[] methods = lcdTVClass.getMethods();
		System.out.println(lcdTVClass.getName() + "�ķ�����");
		for (Method m : methods) {
			System.out.println("  " + m);
		}
		
		try {
			System.out.println("ͨ��������÷���turnOn()");
			Method method = lcdTVClass.getMethod("turnOn", new Class[]{});
			method.invoke(instance2, new Object[]{});
			System.out.println(instance2);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}

interface Televition {
	void turnOn();
	void turnOff();
}

class LcdTV implements Televition {

	private boolean on = false;
	public final int size;
	
	public LcdTV() {
		size = 32;
	}
	
	public LcdTV(int size) {
		this.size = size;
	}
	
	@Override
	public void turnOn() {
		System.out.println("���ӱ���");
		on = true;
	}

	@Override
	public void turnOff() {
		System.out.println("���ӱ��ر�");
		on = false;
	}
	
	@Override
	public String toString() {
		return "LcdTV: on=" + on + ", size=" + size;
	}
	
}