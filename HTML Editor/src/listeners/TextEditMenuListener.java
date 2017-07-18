package listeners;

import java.awt.Component;

import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import main.View;

public class TextEditMenuListener implements MenuListener{
	private View view;
	
	public TextEditMenuListener(View view){
		this.view = view;
	}
	
	@Override
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent menuEvent) {
		JMenu jMenu = (JMenu) menuEvent.getSource();
		Component[] components = jMenu.getMenuComponents();
		for(Component item : components){
			item.setEnabled(view.isHtmlTabSelected());
		}
	}
	
}
