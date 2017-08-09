package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

import exception.InterruptOperationException;

public class ConsoleHelper {
	private static ResourceBundle res = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "common_en");
	private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

	public static void printExitMessage() {
		ConsoleHelper.writeMessage(res.getString("the.end"));
	}
	
	public static void writeMessage(String message) {
		System.out.println(message);
	}

	public static String readString() throws InterruptOperationException {
		String line = "";
		try {
			line = bis.readLine();
			if (line.equalsIgnoreCase(Operation.EXIT.toString())) {
				throw new InterruptOperationException();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public static String askCurrencyCode() throws InterruptOperationException {
		String s = "";
		while (true) {
			writeMessage(res.getString("choose.currency.code"));
			s = readString();
			if (s.length() != 3) {
				writeMessage(res.getString("invalid.data"));
			} else {
				s = s.toUpperCase();
				break;
			}
		}
		return s;
	}

	public static String[] getValidTwoDigits(String currencyCode) throws InterruptOperationException {
		while (true) {
			writeMessage(String.format(res.getString("choose.denomination.and.count.format"), currencyCode));
			String userInput = readString();
			String[] strmas = userInput.split(" ");
			try {
				if (strmas.length == 2 && Integer.parseInt(strmas[0]) >= 0 && Integer.parseInt(strmas[1]) >= 0) {
					return strmas;
				} else {
					writeMessage(res.getString("invalid.data"));
				}
			} catch (NumberFormatException ex) {
				writeMessage(res.getString("invalid.data"));
			}
		}
	}

	public static Operation askOperation() throws InterruptOperationException {
		writeMessage("Enter operation:\n1 - INFO, 2 - DEPOSIT, 3 - WITHDRAW, 4 - EXIT");
		Operation operation;
		while (true) {
			String s = readString();
			int l;
			try {
				l = Integer.parseInt(s);
				operation = Operation.getAllowableOperationByOrdinal(l);
			} catch (Exception e) {
				writeMessage(res.getString("invalid.data"));
				continue;
			}
			break;
		}
		return operation;
	}
}
