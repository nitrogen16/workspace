package actions;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import main.View;

public class UndoAction extends AbstractAction{
	private View view;
	public UndoAction(View view){
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		view.undo();
	}
}
