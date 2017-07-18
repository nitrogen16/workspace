import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		 
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(500);
		numbers.add(25000);
		
		//Retrieving
		System.out.println(numbers.get(2));
		System.out.println("======================================");
		
		sum(numbers);
		//Indexed for loop Iteration
		
		System.out.println("Iteration #2: ");
		for(Integer value : numbers){
			System.out.println(value);
		}
		System.out.println("======================================");

		//Removing. Slow method
		numbers.remove(0);
		numbers.remove(numbers.size() - 1);
		System.out.println("Iteration #3 after removing: ");
		for(Integer value : numbers){
			System.out.println(value);
		}
		
		//List Interface
		List<String> values = new ArrayList<String>();
		
	}

	private static void sum(ArrayList<Integer> numbers) {
		System.out.println("Iteration #1: ");
		int sum = 0;
		for(int i : numbers){
			sum += i;
		}
		System.out.println("Summary of ArrayList is: " + sum);
	}

}
