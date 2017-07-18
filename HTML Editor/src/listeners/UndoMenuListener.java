package listeners;

import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import main.View;

public class UndoMenuListener implements MenuListener{
	private View view;
	private JMenuItem undoMenuItem;
	private JMenuItem redoMenuItem;
	public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem){
		this.view = view;
		this.undoMenuItem = undoMenuItem;
		this.redoMenuItem = redoMenuItem;
	}
	
	@Override
	public void menuCanceled(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuDeselected(MenuEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void menuSelected(MenuEvent menuEvent) {
		if(view.canUndo()){
			undoMenuItem.setEnabled(true);
		}else{
			undoMenuItem.setEnabled(false);
		}
		
		if(view.canRedo()){
			redoMenuItem.setEnabled(true);
		}else{
			redoMenuItem.setEnabled(false);
		}
	}
	
}
