package command;

import java.nio.file.Path;
import java.nio.file.Paths;

import main.ConsoleHelper;
import main.ZipFileManager;

public class ZipRemoveCommand extends ZipCommand{

	@Override
	public void execute() throws Exception {
		ConsoleHelper.writeMessage("Удаление файла из архива.");
		ZipFileManager zipFileManager = getZipFileManager();
		ConsoleHelper.writeMessage("Введите полное имя файла для удаления из архива:");
		Path sourcePath = Paths.get(ConsoleHelper.readString());
		zipFileManager.removeFile(sourcePath);
		ConsoleHelper.writeMessage("Файл удалён из архива");		
	}

}
