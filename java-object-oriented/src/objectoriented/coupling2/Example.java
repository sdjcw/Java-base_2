package objectoriented.coupling2;

public class Example {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.playVideo();
	}
}

class Television {
	private Panel panel = PanelFactory.createLcdPanel();

	public void playVideo() {
		panel.display();
	}
}

class PanelFactory {
	public static Panel createLcdPanel() {
		return new LcdPanel();
	}
	
	public static Panel createCrtPanel() {
		return new CrtPanel();
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