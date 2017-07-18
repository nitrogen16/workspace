import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("test.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			
			br.write("This is 1st line");
			br.newLine();
			br.write("This is 2nd line");
			br.newLine();
			br.write("The last line");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to write a file" + file.toString());
		}
		
		
	}

}
