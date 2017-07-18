import java.util.ArrayList;
import java.util.List;

public class Snake {
	private List<SnakeSection> sections;
	private boolean isAlive;
	private SnakeDirection direction;
	
	public List<SnakeSection> getSections() {
		return sections;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public SnakeDirection getDirection() {
		return direction;
	}
	public void setDirection(SnakeDirection direction) {
		this.direction = direction;
	}
	public void move(){
		if(isAlive == false){
		}else if(direction == SnakeDirection.UP){
			move(0, -1);
		}else if(direction == SnakeDirection.RIGHT){
			move(1, 0);
		}else if(direction == SnakeDirection.DOWN){
			move(0, 1);
		}else if(direction == SnakeDirection.LEFT){
			move(-1, 0);
		}
	}
	
	public void move(int dx, int dy){
		SnakeSection head = sections.get(0);
		head = new SnakeSection(sections.get(0).getX() + dx, sections.get(0).getY() + dy);
		checkBorders(head);
		checkBody(head);
		if(isAlive){
			sections.add(0, head);
			if(Room.game.getMouse().getX() == head.getX() && Room.game.getMouse().getY() == head.getY()){
				Room.game.eatMouse();
			}else{
				sections.remove(sections.size() - 1);
			}
		}
	}

	public void checkBorders(SnakeSection head){
		int headX = head.getX();
		int headY = head.getY();
		int widthRoom = Room.game.getWidth();
		int heightRoom = Room.game.getHeight();
		if(headX < 0 || headX >= widthRoom || headY < 0 || headY >= heightRoom){
			isAlive = false;
		}
	}
	public void checkBody(SnakeSection head){
		if(getSections().contains(head)){
			isAlive = false;
		}
	}

	
	public Snake(int x, int y) {
		this.sections = new ArrayList<SnakeSection>();
		sections.add(new SnakeSection(x, y));
		isAlive = true;
	}
	
	public int getX(){
		return sections.get(0).getX();
	}
	
	public int getY(){
		return sections.get(0).getY();
	}
	
}
