package car;

public class Cabriolet extends Car{

	public Cabriolet(int numberOfPassengers) {
		super(Car.CABRIOLET, numberOfPassengers);
	}
	private final int MAX_CABRIOLET_SPEED = 90;
    public int getMaxSpeed() {
    	return MAX_CABRIOLET_SPEED;
    }
}
