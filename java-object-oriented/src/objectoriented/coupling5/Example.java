package objectoriented.coupling5;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		Context context = new Context();
		Television tv = (Television) context.getService("tv");
		tv.playVideo();
	}
}

class Context {

	private final Map<String, Object> services = new HashMap<String, Object>();

	public Context() {
		LcdPanel panel = new LcdPanel();
		registerService("panel", panel);

		Television tv = new Television();
		tv.setPanel(panel);
		registerService("tv", tv);
	}

	public Object getService(String serviceName) {
		return services.get(serviceName);
	}

	private void registerService(String serviceName, Object service) {
		services.put(serviceName, service);
	}
}

class Television {
	private Panel panel;

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	public void playVideo() {
		panel.display();
	}
}

interface Panel {
	public void display();
}

class LcdPanel implements Panel {
	public void display() {
		System.out.println("LcdPanelœ‘ æª≠√Ê...");
	}
}