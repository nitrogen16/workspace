package model;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class LevelLoader {

	public LevelLoader(Path levels) {
		// TODO Auto-generated constructor stub
	}
	
	public GameObjects getLevel(int level) {
		int x0 = Model.FIELD_CELL_SIZE / 2;
		int y0 = Model.FIELD_CELL_SIZE / 2;
		
		Player player = new Player(x0, y0);
		
		Set<Home> homes = new HashSet<Home>();
		homes.add(new Home(x0, y0));
		
		Set<Box> boxes = new HashSet<Box>();
		boxes.add(new Box(x0, y0));
		
		Set<Wall> walls = new HashSet<Wall>();
		walls.add(new Wall(x0, y0));
		walls.add(new Wall(x0, y0));
		
		return new GameObjects(walls, boxes, homes, player);
	}
	
}