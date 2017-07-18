import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet does not retain order
		Set<String> set1 = new HashSet<String>();
		if(set1.isEmpty()){
			System.out.println("Set is empty at start!");
		}
		
		set1.add("dog");
		set1.add("glooomy");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		if(set1.isEmpty()){
			System.out.println("Set is empty after adding (no!)");
		}
		
		//Linked HashSet remembers the order you added items in
		Set<String> set2 = new LinkedHashSet<String>();
		set2.add("dog");
		set2.add("cat");
		set2.add("crocodile");
		set2.add("snake");
		set2.add("bear");
		
		//TreeSet sorts in natural order
		Set<String> set3 = new TreeSet<String>();
		set3.add("dog");
		set3.add("cat");
		set3.add("mouse");
		set3.add("snake");
		set3.add("bear");
		System.out.println("SET 3 IS: " + set3);
		//adding duplicate items does nothing
		
		//set1.add("mouse");
		
		//System.out.println(set3);
		
		////////Iteration////////////
		for (String element : set3){
			System.out.println("set 3: " + element);
		}
		
		////Does set contain a given item
		if(set1.contains("cat")){
			System.out.println("Contains cat");
		}
		if(set1.contains("qwe")){
			System.out.println("Contains qwe");
		}
		
		
		////set2 contains some common elements with set1, and some new
		////////////Intersection//////////////
		//HashSet does not retain order
		System.out.println("_____________________________________________________________");
		
		Set<String> set4 = new TreeSet<String>();
		set4.add("dog");
		set4.add("cat");
		set4.add("girafee");
		set4.add("monkey");
		set4.add("ant");
		
		Set<String> intersection = new HashSet<String>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set4);
		System.out.println(intersection);
		
		//////////////Difference////////////
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set4);
		System.out.println(difference);
	}

}
