package objectoriented.coupling3;

public class Example {
	public static void main(String[] args) {
//		System.setProperty("panel.impl.class",
//				"objectoriented.coupling3.CrtPanel");

		Television tv = new Television();
		tv.playVideo();
	}
}

class Television {
	private Panel panel = PanelFactory.createPanel();

	public void playVideo() {
		panel.display();
	}
}

class PanelFactory {
	private static final String DEFAULT_PANEL = "objectoriented.coupling3.LcdPanel";

	public static Panel createPanel() {
		String panel = System.getProperty("panel.impl.class");
		if (panel == null) {
			panel = DEFAULT_PANEL;
		}
		try {
			Class<?> panelClass = PanelFactory.class.getClassLoader()
					.loadClass(panel);
			return (Panel) panelClass.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

interface Panel {
	public void display();
}

class LcdPanel implements Panel {
	public void display() {
		System.out.println("LcdPanel显示画面...");
	}
}

class CrtPanel implements Panel {
	public void display() {
		System.out.println("CrtPanel显示画面...");
	}
}