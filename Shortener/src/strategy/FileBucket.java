package strategy;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileBucket {
	Path path;
	
	public FileBucket(){
		this.path = Files.createTempFile(arg0, arg1, arg2)
	}
}