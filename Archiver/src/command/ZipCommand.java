package command;

import java.nio.file.Path;
import java.nio.file.Paths;

import main.ConsoleHelper;
import main.ZipFileManager;

public abstract class ZipCommand implements Command{
	
	public ZipFileManager getZipFileManager() throws Exception {
		ConsoleHelper.writeMessage("Введите полный путь файла архива:");
		Path zipPath = Paths.get(ConsoleHelper.readString());
		return new ZipFileManager(zipPath);
	}	
    
}
