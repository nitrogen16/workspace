import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class App {

	public static void main(String[] args) {
		
		File file = new File("text3.txt");
		
		BufferedReader br = null;
		
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line;
			
			while((line = br.readLine())!= null){
				System.out.println(line);
			};
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read a file: " + file.toString());
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Unable to close a file!" + file.toString());
			}
			catch(NullPointerException ex){
				// File was never opened
				System.out.println("File was not opened: " + file.toString());
			}
		}
		


	}

}
