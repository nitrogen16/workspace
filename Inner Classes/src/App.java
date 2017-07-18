
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot(120);
		robot.start();
		
		//Robot.Brain brain = robot.new Brain();
		//brain.think();

		Robot.Battery battery = new Robot.Battery();
		battery.charge();
		
	}

}
