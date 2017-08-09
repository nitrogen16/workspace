package controller;

import model.Direction;
import model.GameObjects;
import model.Model;
import view.View;

public class Controller implements EventListener{
	private Model model;
	private View view;
	
	public Controller() {
		this.model = new Model();
		this.view = new View(this);
		this.view.init();
		this.model.restart();
		this.model.setEventListener(this);
		this.view.setEventListener(this);
	}
	
	public GameObjects getGameObjects() {
		return model.getGameObjects();
	}
	
	public static void main(String[] args) {
		Controller controller = new Controller();
	}

	@Override
	public void move(Direction direction) {
		// TODO Auto-generated method stub
		model.move(direction);
		view.update();
		
	}

	@Override
	public void restart() {
		// TODO Auto-generated method stub
		model.restart();
		view.update();
	}

	@Override
	public void startNextLevel() {
		// TODO Auto-generated method stub
		model.startNextLevel();
		view.update();
	}

	@Override
	public void levelCompleted(int level) {
		// TODO Auto-generated method stub
		view.completed(level);
	}
}
