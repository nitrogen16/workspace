
public class App {
	
	public static void main(String[] args) {
		
		Test test1 = new Test();
		
		int value = test1.getInitialValue();
		
		test1.doStuff(value);
		
		System.out.println("Starting...");
		
		System.out.println("Incrementing a value.");
		
		value++;
		
		value += 8; 
		
		System.out.println(value);
		
		System.out.println("Finishing...");
	}
	

}
