package main;

import java.util.Locale;
import java.util.ResourceBundle;

import command.CommandExecutor;
import exception.InterruptOperationException;

public class CashMachine {
	public static final String RESOURCE_PATH = "resources.";

	public static void main(String[] args) throws InterruptOperationException {
		ResourceBundle res = ResourceBundle.getBundle(RESOURCE_PATH + "common_en", Locale.ENGLISH);
		try {
			CommandExecutor.execute(Operation.LOGIN);
			Operation operation = null;
			do {
				ConsoleHelper.writeMessage(res.getString("choose.operation") + " \n" + res.getString("operation.INFO")
						+ ": 1;\n" + res.getString("operation.DEPOSIT") + ": 2;\n" + res.getString("operation.WITHDRAW")
						+ ": 3;\n" + res.getString("operation.EXIT") + ": 4");
				operation = ConsoleHelper.askOperation();
				CommandExecutor.execute(operation);
			} while (operation != Operation.EXIT);
		} catch (InterruptOperationException e) {
			ConsoleHelper.printExitMessage();
		}
	}
}