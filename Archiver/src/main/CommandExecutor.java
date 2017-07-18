package main;
import java.util.HashMap;
import java.util.Map;
import command.*;
import static main.Operation.*;
public class CommandExecutor {
	private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();
	static{
		allKnownCommandsMap.put(CREATE, new ZipCreateCommand());
		allKnownCommandsMap.put(ADD, new ZipAddCommand());
		allKnownCommandsMap.put(REMOVE, new ZipRemoveCommand());
		allKnownCommandsMap.put(EXTRACT, new ZipExtractCommand());
		allKnownCommandsMap.put(CONTENT, new ZipContentCommand());
		allKnownCommandsMap.put(EXIT, new ExitCommand());
	}
	
	private CommandExecutor() {

	}
	
	public static void execute(Operation operation) throws Exception{
		allKnownCommandsMap.get(operation).execute();
	}
}
