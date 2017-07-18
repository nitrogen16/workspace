
public class Car extends Machine{

	@Override
	public void start() {
		
		System.out.println("Starting Car...");
		
	}

	@Override
	public void doStuff() {
		
		System.out.println("DOSTUFF car...");
		
	}

	@Override
	public void shutDown() {
		
		System.out.println("Shutting down a Car...");
		
	}

}
