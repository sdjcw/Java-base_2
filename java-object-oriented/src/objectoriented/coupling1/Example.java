package objectoriented.coupling1;

public class Example {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.playVideo();
	}
}

class Television {
	private Panel panel = new LcdPanel();

	public void playVideo() {
		panel.display();
	}
}

interface Panel {
	public void display();
}

class LcdPanel implements Panel {
	
	private int size;
	
	public LcdPanel() {
		size = 24;
	}
	
	public LcdPanel(int size) {
		this.size = size;
	}
	
	public void display() {
		System.out.println("LcdPanelœ‘ æª≠√Ê...");
	}
}