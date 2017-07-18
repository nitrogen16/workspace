package main;
import java.io.File;
import javax.swing.filechooser.FileFilter;

public class HTMLFileFilter extends FileFilter{

	@Override
	public boolean accept(File file) {
		if(file.isDirectory() || file.getName().toLowerCase().endsWith(".html")|| file.getName().toLowerCase().endsWith(".htm")){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public String getDescription() {
		return "HTML и HTM файлы";
	}
	
}
