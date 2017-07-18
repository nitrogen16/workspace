import java.util.Scanner;


public class App {

	public static void main(String[] args) {
	
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("Enter a line of text: ");
		
		//Wait for the User to enter a line of text
		String line = input.nextLine();
		
		//Tell them what they entered
		System.out.println("Yoe entered: " + line);
	}

}
