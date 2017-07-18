import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return "ID is " + id + ": " + name; 
	}
}

class StringLengthComparator implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();
		
		if (len1 > len2){
			return 1;
		}
		else if (len1 < len2){
			return -1;
		}
		return 0;
	}
}

class AlphabeticalComparator implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);	
	}
}

class ReverseAlphabeticalComparator implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//////////////////Sorting Strings

		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		
		//Collections.sort(animals, new StringLengthComparator());
		//Collections.sort(animals, new AlphabeticalComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println("ReverseAlphabeticalComparator is: ");
		for(String animal : animals){
			System.out.println(animal);
		}
		
		System.out.println("--------------------------------------------------");
		
		
		//////////////////Sorting Integers
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(36);
		numbers.add(73);
		numbers.add(50);
		numbers.add(1);
		Collections.sort(numbers, new Comparator<Integer>(){
			@Override
			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
		
		});
		
		for(Integer number : numbers){
			System.out.println(number);
		}
		
		System.out.println("--------------------------------------------------");
		
//////////////////Sorting Arbitrary Classes
		List <Person> people = new ArrayList<Person>();
		people.add(new Person (1, "Joe"));
		people.add(new Person (3, "Bob"));
		people.add(new Person (4, "Clare"));
		people.add(new Person (2, "Sue"));
		
		
		//// Sort in order of id
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				
				if(p1.getId() > p2.getId()){
					return 1;
				}
				else if(p1.getId() < p2.getId()){
					return -1;
				}
				return 0;
			}
			
		});
		
		for (Person person: people){
			System.out.println(person);
		}
		
		System.out.println("--------------------------------------------------");
		
		
		//// Sort in order of name
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		for (Person person: people){
			System.out.println(person);
		}
	}

}
