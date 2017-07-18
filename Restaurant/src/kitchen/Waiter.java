package kitchen;

import java.util.Observable;
import java.util.Observer;

import main.ConsoleHelper;

public class Waiter implements Observer{

	@Override
	public void update(Observable observable, Object order) {
		ConsoleHelper.writeMessage(order + " was cooked by " + observable);
	}
	
}
