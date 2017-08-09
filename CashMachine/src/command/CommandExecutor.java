package command;

import java.util.HashMap;
import java.util.Map;

import exception.InterruptOperationException;
import main.Operation;

public class CommandExecutor {
	private final static Map<Operation, Command> allKnownCommandsMap = new HashMap<Operation, Command>();
	static {
		allKnownCommandsMap.put(Operation.LOGIN, new LoginCommand());
		allKnownCommandsMap.put(Operation.INFO, new InfoCommand());
		allKnownCommandsMap.put(Operation.DEPOSIT, new DepositCommand());
		allKnownCommandsMap.put(Operation.WITHDRAW, new WithdrawCommand());
		allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
	}
	
	public static final void execute(Operation operation) throws InterruptOperationException {
		allKnownCommandsMap.get(operation).execute();
	}
	
	private CommandExecutor(){
		
	}
}
