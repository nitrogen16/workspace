package command;

import java.util.ResourceBundle;

import main.CashMachine;
import main.ConsoleHelper;
import main.CurrencyManipulator;
import main.CurrencyManipulatorFactory;

class InfoCommand implements Command {
	private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "info_en");
	
	@Override
	public void execute() {
		boolean money = false;
		ConsoleHelper.writeMessage(res.getString("before"));
		for(CurrencyManipulator cur : CurrencyManipulatorFactory.getAllCurrencyManipulators()) {
			if(cur.hasMoney()) {
				if(cur.getTotalAmount() > 0) {
					ConsoleHelper.writeMessage(cur.getCurrencyCode() + " - " + cur.getTotalAmount());
					money = true;
				}
			}
		}
		if(!money) {
			ConsoleHelper.writeMessage(res.getString("no.money"));
		}
	}
}
