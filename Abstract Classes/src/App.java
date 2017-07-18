
public class App {

	public static void main(String[] args) {
		
		Camera cam1 = new Camera();
		cam1.setId(5);
		System.out.println(cam1.getId());
		cam1.run();
		
		Car car1 = new Car();
		car1.setId(4);
		System.out.println(car1.getId());
		car1.run();
		
		//Machine machine1 = new Machine();

	}

}
