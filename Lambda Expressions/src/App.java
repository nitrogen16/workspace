interface Executable{
	int execute(int a, int b);
}

interface StringExecutable{
	String execute(String a);
}

class Runner{
	public void run(Executable e){
		System.out.println("Executing block code...");
		int value = e.execute(1351, 1250);
		System.out.println("Returning a value: " + value);
	}
	
public void run(StringExecutable e){
		System.out.println("Executing block code...");
		String value = e.execute("Hello! I'm a String");
		System.out.println("Returning a value: " + value);
	}
}


/*
		runner.run(() -> {
		
		System.out.println("This is code passed in Lambda expression.");
		System.out.println("Hello there!!!");
		});
 */

/*
		runner.run(() -> {
		
		System.out.println("This is code passed in Lambda expression.");
		System.out.println("Hello there!!!");
		return 2323232;
		});
 */
public class App {

	public static void main(String[] args) {
		
		int c = 100;
		
		Runner runner = new Runner();
		
		runner.run(new Executable(){
			public int execute(int a, int b) {
				System.out.println("Hello there!");
				return a + b;
			}
		
		});
		
		runner.run((a,b) -> {
			//int c = 1000; no new scope, c variable was defined above
		return c + a + b;
		});
		
		System.out.println("==============================");
		
		runner.run((String a) -> a);
		
		runner.run(new StringExecutable(){
			@Override
			public String execute(String a) {
				System.out.println("Hello there!");
				return 5315313 + ". " + a;
			}
		
		});
	}

}
