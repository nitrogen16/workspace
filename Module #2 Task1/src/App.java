import java.util.ArrayList;
import cars.*;

public class App {
	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList();
		Car firstCar = new Car(Brand.OPEL , "Vectra", 15250.2, 8.2);
		Car secondCar = new Car(Brand.TOYOTA , "Yaris", 5250.3, 4.35);
		Car thirdCar = new Car(Brand.HONDA , "Civic", 12250.45, 6.7);
		
		cars.add(firstCar);
		cars.add(secondCar);
		cars.add(thirdCar);
		System.out.println(cars);
		
		//for(int i=1; i<Brand.values().length; i++){
		//System.out.println(Brand.values()[i].getName());
		}
	}