package command;

import java.util.ResourceBundle;

import exception.InterruptOperationException;
import main.CashMachine;
import main.ConsoleHelper;
import main.CurrencyManipulator;
import main.CurrencyManipulatorFactory;

class DepositCommand implements Command{
	private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + ".deposit_en");
	
	@Override
	public void execute() throws InterruptOperationException {
		// TODO Auto-generated method stub
		ConsoleHelper.writeMessage(res.getString("before"));
		String currencyCode = ConsoleHelper.askCurrencyCode();
		String [] moneyAndAmount = ConsoleHelper.getValidTwoDigits(currencyCode);
		CurrencyManipulator  currentMon = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
		
		try {
			int k = Integer.parseInt(moneyAndAmount[0]);
			int l = Integer.parseInt(moneyAndAmount[1]);
			currentMon.addAmount(k, l);
			ConsoleHelper.writeMessage(String.format(res.getString("success.format"), k * l, currencyCode));
		}catch(NumberFormatException e) {
			ConsoleHelper.writeMessage(res.getString("invalid.data"));
		}
	}

}
