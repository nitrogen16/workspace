package command;

import java.nio.file.Path;
import java.nio.file.Paths;

import exception.PathIsNotFoundException;
import main.ConsoleHelper;
import main.ZipFileManager;

public class ZipCreateCommand extends ZipCommand{
	@Override
	public void execute() throws Exception {
		try {
			ConsoleHelper.writeMessage("Создание архива.");
			ZipFileManager zipFileManager = getZipFileManager();
			ConsoleHelper.writeMessage("Введите полное имя файла или директории для архивации:");
			Path sourcePath = Paths.get(ConsoleHelper.readString());
			zipFileManager.createZip(sourcePath);
			ConsoleHelper.writeMessage("Архив создан.");
		}
		catch (PathIsNotFoundException e) {
			ConsoleHelper.writeMessage("Вы неверно указали имя файла или директории.");
		}
	}
}