package objectoriented.coupling4;

import java.util.HashMap;
import java.util.Map;

public class Example {

	public static void main(String[] args) {
		GlobalRegistry.registerService("panel", new LcdPanel());

		Television tv = new Television();
		tv.playVideo();
	}

}

class GlobalRegistry {
	private static final Map<String, Object> services = new HashMap<String, Object>();

	public static void registerService(String serviceName, Object service) {
		services.put(serviceName, service);
	}

	public static Object getService(String serviceName) {
		return services.get(serviceName);
	}
}

class Television {
	private Panel panel = (Panel) GlobalRegistry.getService("panel");

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