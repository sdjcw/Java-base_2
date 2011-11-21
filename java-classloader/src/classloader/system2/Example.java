package classloader.system2;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class Example {

	public static void main(String[] args) throws Exception {
		URL url = new File("d:\\").toURI().toURL();
		ClassLoader cl = new URLClassLoader(new URL[] { url });
		Class<?> tvClass = cl.loadClass("Television");
		Object tv = tvClass.newInstance();

		Object panel = cl.loadClass("Panel").newInstance();
		Method setPanelMethod = tvClass.getMethod("setPanel", Object.class);
		setPanelMethod.invoke(tv, panel);
		Method playVideoMethod = tvClass.getMethod("playVideo", new Class[] {});
		playVideoMethod.invoke(tv, new Object[] {});

		System.out.println("不同的ClassLoader加载。。。");
		ClassLoader cl2 = new URLClassLoader(new URL[] { url });
		Object panel2 = cl2.loadClass("Panel").newInstance();
		setPanelMethod.invoke(tv, panel2);
	}

}

// 将下面两个类拷贝到d盘根目录并编译
class Television {
	private Panel panel;

	public void setPanel(Object panel) {
		this.panel = (Panel) panel;
	}

	public void playVideo() {
		panel.display();
	}
}

class Panel {
	public void display() {
		System.out.println("Panel显示画面...");
	}
}