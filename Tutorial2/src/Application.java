
public class Application {
		public static void main(String[] args) {
			
			int myInt= 7;
			
			String text = "Hello";
			
			String blank = " ";
			
			String name = "Bob!";
			
			String greeting = text + blank + name;
			
			System.out.println(greeting);
			
			System.out.println("Hello" + " " + "Bob!");
			
			double myDouble = 7.8;
			
			System.out.println("My number is " + myDouble + ".");
			
			//String a = null; 
			
			StringBuilder s = new StringBuilder();
			s.append(5).append("ss").append(10.2);
			
			//s.toString();
			
			System.out.println(s);
			
		}
}
