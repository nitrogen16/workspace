import java.util.ArrayList;
import java.util.HashMap;

class Animal{
	
}

public class App {

	public static void main(String[] args) {
			
		/// Before Java5
		
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		
		/// Generics aka Modern Style
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("alligator");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		//// More than 1 argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//// Java 7 style
		ArrayList<Animal> someList = new ArrayList<>();
	}

}
