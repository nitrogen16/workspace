package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import controller.Controller;
import controller.EventListener;
import model.GameObjects;

public class View extends JFrame {
    private Controller controller;
    private Field field;

    public View(Controller controller) {
        this.controller = controller;
    }
    
	public GameObjects getGameObjects() {
		return controller.getGameObjects();
	}

    public void init() {
        field = new Field(this);
        add(field);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setTitle("Сокобан");
        setVisible(true);
    }
    
    public void setEventListener(EventListener eventListener) {
		field.setEventListener(eventListener);
	}
    
    public void update() {
    	field.repaint();
    }

	public void completed(int level) {
		// TODO Auto-generated method stub
		update();
		JOptionPane.showMessageDialog(this, "Вы прошли " + level + " уровень!");
		controller.startNextLevel();
	}
}
