package car;

public class Truck extends Car{
	
	
	public Truck(int numberOfPassengers) {
		super(Car.TRUCK, numberOfPassengers);
	}
	
	private final int MAX_TRUCK_SPEED = 80;
    public int getMaxSpeed() {
    	return MAX_TRUCK_SPEED;
    }
}
