package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Could not open a file");// vague message
		}
		
	}
	
	public static void openFile() throws FileNotFoundException{
		
		File file = new File("example.txt");
		
		FileReader fr = new FileReader(file);
		
		//Reading a file content
		Scanner in = new Scanner(fr);
		
		//int value = in.nextInt();
		//System.out.println("Read value: " + value);
		
		in.nextLine();// carriage return
		
		//int count = 0;
		while(in.hasNextLine()){
			String line = in.nextLine();
			System.out.println(line);
			//System.out.println(count + ": " + line);
			//count++;
		}
		
		in.close();
		

		}
	}

