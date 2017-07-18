
public class Robot {

	private int id;
	
	public class Brain{
		public void think(){
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	public static class Battery{
		public void charge(){
			System.out.println("Battery is charging...");
		}
	}

	public Robot(int id) {
		this.id = id;
	}
	
	public void start(){
		System.out.println("Robot starts working " + id);
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		class Temp{
			public void doSmth(){
				System.out.print("Id is " + id + ". ");
				System.out.println("My name is " + name);
			}
		}
		Temp temp = new Temp();
		temp.doSmth();
	}
}
