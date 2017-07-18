
public class Car extends Machine{
	public void wipeWind(){
		System.out.println("Wiping wind in a car!");
	}
	
	public void start(){
		System.out.println("Car started!");
	}
	public void stop(){
		System.out.println("Car stopped!");
	}
	
	public void showInfo(){
		System.out.println("Car name " + name);
	}
}
