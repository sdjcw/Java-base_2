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
		
		System.out.println("类名：" + lcdTVClass.getName());
		System.out.println(lcdTVClass.getName() + "是一个接口吗？ " + lcdTVClass.isInterface());
		
		Class<?> superclass = lcdTVClass.getSuperclass();
		System.out.println(lcdTVClass.getName() + "的父类？ " + superclass);
		
		System.out.println(lcdTVClass.getName() + "实现了接口 :");
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
		System.out.println("使用newInstance()创建对象：" + instance);
		
		Constructor<?>[] constructors = lcdTVClass.getConstructors();
		for (Constructor con : constructors) {
			System.out.print(lcdTVClass.getName() + "的构造器：" + con);
			Class[] parameterTypes = con.getParameterTypes();
			System.out.println("  参数类型：" + Arrays.toString(parameterTypes));
		}
		
		Object instance2 = null;
		try {
			Constructor<?> con = lcdTVClass.getConstructor(int.class);
			instance2 = con.newInstance(54);
			System.out.println("使用构造器" + con + "创建对象：" + instance2);
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
		System.out.println(lcdTVClass.getName() + "的方法：");
		for (Method m : methods) {
			System.out.println("  " + m);
		}
		
		try {
			System.out.println("通过反射调用方法turnOn()");
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
		System.out.println("电视被打开");
		on = true;
	}

	@Override
	public void turnOff() {
		System.out.println("电视被关闭");
		on = false;
	}
	
	@Override
	public String toString() {
		return "LcdTV: on=" + on + ", size=" + size;
	}
	
}