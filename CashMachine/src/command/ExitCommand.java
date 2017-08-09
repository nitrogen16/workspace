package command;

import java.util.ResourceBundle;

import exception.InterruptOperationException;
import main.CashMachine;
import main.ConsoleHelper;

class ExitCommand implements Command {
	private ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit_en");
	
	@Override
	public void execute() throws InterruptOperationException{
		ConsoleHelper.writeMessage(res.getString("exit.question.y.n"));
		String userAnswer = ConsoleHelper.readString();
		if(userAnswer.equals("y")) {
			ConsoleHelper.writeMessage(res.getString("thank.message"));
		}
	}
}
