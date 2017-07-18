package car;

public class Sedan extends Car{

	public Sedan(int numberOfPassengers) {
		super(Car.SEDAN, numberOfPassengers);
	}
	private final int MAX_SEDAN_SPEED = 120;
    public int getMaxSpeed() {
    	return MAX_SEDAN_SPEED;
    }
}
