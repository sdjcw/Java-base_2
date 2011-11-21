package guiceexample;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Example {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MyModule());
		Television tv = injector.getInstance(Television.class);
		tv.playVideo();
	}

}

class MyModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(Panel.class).to(LcdPanel.class);
		bind(Television.class);
	}
}

class Television {
	@Inject
	private Panel panel;

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