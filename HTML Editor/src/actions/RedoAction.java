package actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import main.View;

public class RedoAction extends AbstractAction{
	private View view;
	
	public RedoAction(View view){
		this.view = view;
	}

	
	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		view.redo();
	}
	
}
