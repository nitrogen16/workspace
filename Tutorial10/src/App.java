
public class App {

	public static void main(String[] args) {
	
		int value = 7;
		
		int[] values;
		
		values = new int[3];
		
		values[0] = 101;
		values[1] = 201;
		values[2] = 301;
		
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		
		for(int i = 0; i < values.length; i++){
			System.out.println(values[i]);
		}
		
		int[] numbers = {1000, 2500, 3500};
		for (int i=0; i<numbers.length; i++){
			System.out.println(numbers[i]);
		}
		numbers[2] = 258025;
		System.out.println("3rd changed element is: " + numbers[2]);
	}

}
