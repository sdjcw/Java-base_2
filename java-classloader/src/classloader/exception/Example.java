package classloader.exception;

public class Example {

	public static void main(String[] args) throws Exception {
		Television tv = new Television();
		tv.playVideo();
	}

}

class Television {
	private Panel panel = new Panel();

	public void playVideo() {
		panel.display();
	}
}

class Panel {
	public void display() {
		System.out.println("Panelœ‘ æª≠√Ê...");
	}
}
