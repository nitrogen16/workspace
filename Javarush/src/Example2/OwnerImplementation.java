package Example2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class OwnerImplementation {
	
	public static void main(String[] args) throws IOException {
		//String[] bArray = {"a","b","c", "d", "e"};

		//System.out.println(writeBytes("C:\\Users\\Viachaslau_Amelin\\Desktop\\Examples\\example1.txt", bArray));
		
	}
	
	   public static byte[] readBytes(String fileName) throws IOException {
	       return Files.readAllBytes(Paths.get(fileName));
	    }

	    public static List<String> readLines(String fileName) throws IOException {
	        return Files.readAllLines(Paths.get(fileName));
	    }

	    public static void writeBytes(String fileName, byte[] bytes) throws IOException {
	    	Files.write(Paths.get(fileName), bytes);
	    }

	    public static void copy(String resourceFileName, String destinationFileName) throws IOException {
	    	Files.copy(Paths.get(resourceFileName), Paths.get(destinationFileName));
	    }
}
//C:\Users\Viachaslau_Amelin\Desktop\Examples