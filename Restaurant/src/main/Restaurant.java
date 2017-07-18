package main;

import kitchen.Cook;
import kitchen.Waiter;

public class Restaurant {

	public static void main(String[] args) throws Exception {
		Waiter waitor = new Waiter();
		Cook cook = new Cook("Amigo");
		cook.addObserver(waitor);
		Tablet tablet = new Tablet(1);
		tablet.addObserver(cook);
		tablet.createOrder();
	}
}
