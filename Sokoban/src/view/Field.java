package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import controller.EventListener;
import model.Direction;
import model.GameObject;

public class Field extends JPanel{
	private EventListener eventListener;
	private View view;
	
	public Field(View view) {
		this.view = view;
		KeyHandler keyHandler = new KeyHandler();
		addKeyListener(keyHandler);
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 500);
		if(view.getGameObjects() == null) {
			return;
		}
		for(GameObject item : view.getGameObjects().getAll()) {
			item.draw(g);
		}
		
//		Player pl = new Player(50, 50);
//		pl.draw(g);
//		Box bx = new Box(100, 100);
//		bx.draw(g);
//		Home h = new Home(250, 250);
//		h.draw(g);
//		Wall w = new Wall(25, 25);
//		w.draw(g);
	}
	
	public void setEventListener(EventListener eventListener) {
		this.eventListener = eventListener;
	}
	
	public class KeyHandler extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			//super.keyPressed(arg0);
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT :
                    eventListener.move(Direction.LEFT);
                    break;
                case KeyEvent.VK_RIGHT :
                    eventListener.move(Direction.RIGHT);
                    break;
                case KeyEvent.VK_UP :
                    eventListener.move(Direction.UP);
                    break;
                case KeyEvent.VK_DOWN :
                    eventListener.move(Direction.DOWN);
                    break;
                case KeyEvent.VK_R :
                    eventListener.restart();
                    break;
		}
		
	}
}
