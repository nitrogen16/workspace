package command;

import java.util.ResourceBundle;

import exception.InterruptOperationException;
import main.CashMachine;
import main.ConsoleHelper;

public class LoginCommand implements Command{
	//private String cardNumber = "123456789012";
	//private String pin = "1234";
	private ResourceBundle verifiedCards = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "verifiedCards");
	private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "login_en");
	
	@Override
	public void execute() throws InterruptOperationException {
		ConsoleHelper.writeMessage(res.getString("before"));
		while(true) {
			ConsoleHelper.writeMessage(res.getString("specify.data"));
			String cardEntered = ConsoleHelper.readString();
			String pinEntered = ConsoleHelper.readString();;
			if(verifiedCards.containsKey(cardEntered)) {
				if(verifiedCards.getString(cardEntered).equals(pinEntered)) {
					ConsoleHelper.writeMessage(String.format(res.getString("success.format"), cardEntered));
				}else {
					ConsoleHelper.writeMessage(String.format("not.verified.format", cardEntered));
					ConsoleHelper.writeMessage(res.getString("try.again.or.exit"));
					continue;
				}
			}else {
                ConsoleHelper.writeMessage(String.format(res.getString("not.verified.format"), cardEntered));
                ConsoleHelper.writeMessage(res.getString("try.again.with.details"));
                continue;
			}
			break;
		}
	}
}
