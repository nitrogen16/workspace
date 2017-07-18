package main;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

import ad.AdvertisementManager;
import ad.NoVideoAvailableException;
import kitchen.Order;
import statistic.StatisticManager;
import statistic.event.NoAvailableVideoEventDataRow;
import statistic.event.VideoSelectedEventDataRow;

public class Tablet extends Observable{
	final int number;
	static Logger logger = Logger.getLogger(Tablet.class.getName());
	
	public Tablet(int number) {
		this.number = number;
	}
	
	public Order createOrder(){
		Order order = null;
		try {
			order = new Order(this);
			ConsoleHelper.writeMessage(order.toString());
			AdvertisementManager advertisementManager = new AdvertisementManager((order.getTotalCookingTime() * 60));
			advertisementManager.processVideos();

			if(order.isEmpty()){
				return null;
			}else{
				setChanged();
				notifyObservers(order);
				return order;
			}
			
		}catch (NoVideoAvailableException e) {
            logger.log(Level.INFO, "No video is available for the order " + order);
            return null;
		}catch (Exception e) {
			logger.log(Level.SEVERE, "Console is unavailable.");
			return null;
		} 
	}

	@Override
	public String toString() {
		return "Tablet{number=" + number + "}";
	}
	

}
