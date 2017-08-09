package model;

import java.nio.file.Paths;
import controller.EventListener;

public class Model {
	
	public static final int FIELD_CELL_SIZE = 20;
	private EventListener eventListener;
	private GameObjects gameObjects;
	private int currentLevel = 1;
	private LevelLoader levelLoader = new LevelLoader(Paths.get("res.levels.txt"));
	
	public void setEventListener(EventListener eventListener) {
		this.eventListener = eventListener;
	}
	
	public GameObjects getGameObjects() {
		return gameObjects;
	}
	
	public void restartLevel(int level) {
		gameObjects = levelLoader.getLevel(level);
	}
	
	public void restart() {
		restartLevel(currentLevel);
	}
	
	public void startNextLevel() {
		currentLevel++;
		restartLevel(currentLevel);
	}

	public void move(Direction direction) {
		// TODO Auto-generated method stub
		
		
	}
}