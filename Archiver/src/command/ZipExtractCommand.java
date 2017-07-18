package command;

import java.nio.file.Path;
import java.nio.file.Paths;

import exception.PathIsNotFoundException;
import main.ConsoleHelper;
import main.ZipFileManager;

public class ZipExtractCommand extends ZipCommand{

	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Распаковка архива.");
			ZipFileManager zipFileManager = getZipFileManager();
			ConsoleHelper.writeMessage("Введите полное имя файла или директории для разархивации:");
			Path sourcePath = Paths.get(ConsoleHelper.readString());
			zipFileManager.extractAll(sourcePath);
			ConsoleHelper.writeMessage("Разархивации завершена.");
		}
		catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("Вы неверно указали имя файла или директории.");
		}
	}

}
