package listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import main.View;

public class FrameListener extends WindowAdapter{
	private View view;

	public FrameListener(View view) {
		this.view = view;
	}

	@Override
	public void windowClosing(WindowEvent windowEvent) {
		view.exit();
	}
	
}
