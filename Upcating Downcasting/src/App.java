class Machine{
	public void start(){
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start(){
		System.out.println("Camera started.");
	}
	public void snap(){
		System.out.println("Photo is taken.");
	}
}


public class App {

	public static void main(String[] args) {
			
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		System.out.println();
		
		//Upcasting
		Machine machine2 = camera1;
		machine1.start();
		//machine1.snap(); not defined in Machine class
		
		System.out.println();
		//Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.start();
		camera2.snap();
		
		//runtime error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.start();
		//camera3.snap();
		

	}

}
