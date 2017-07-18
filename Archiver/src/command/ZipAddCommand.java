package command;

import java.nio.file.Path;
import java.nio.file.Paths;

import exception.PathIsNotFoundException;
import main.ConsoleHelper;
import main.ZipFileManager;

public class ZipAddCommand extends ZipCommand{

	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Добавление нового файла в архив.");

			ZipFileManager zipFileManager = getZipFileManager();

			ConsoleHelper.writeMessage("Введите полное имя файла для добавления:");
			Path sourcePath = Paths.get(ConsoleHelper.readString());
			zipFileManager.addFile(sourcePath);

			ConsoleHelper.writeMessage("Добавление в архив завершено.");
		}
		catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("Файл не был найден.");
		}
}
}
