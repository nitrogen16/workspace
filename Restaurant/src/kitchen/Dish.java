package kitchen;

import java.util.Arrays;

public enum Dish {
	
	Fish(25),
	Steak(30),
	Soup(15),
	Juice(5),
	Water(3);
	
	private int duration;
	
	private Dish(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}

	public static String allDishesToString(){
		return Arrays.toString(Dish.values()).substring(1, Arrays.toString(Dish.values()).length() - 1);
	}
}
