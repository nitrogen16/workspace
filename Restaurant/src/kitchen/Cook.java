package kitchen;

import java.util.Observable;
import java.util.Observer;

import main.ConsoleHelper;
import statistic.StatisticManager;
import statistic.event.CookedOrderEventDataRow;

public class Cook extends Observable implements Observer{
	private String name;

	public Cook(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public void update(Observable observable, Object arg) {
		Order order = (Order) arg;
		ConsoleHelper.writeMessage("Start cooking - " + order);
		StatisticManager.getInstance().register(new CookedOrderEventDataRow(observable.toString(), name, order.getTotalCookingTime()*60, order.getDishes()));
		setChanged();
		notifyObservers(arg);		
	}
}
