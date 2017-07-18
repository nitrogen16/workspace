import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	public String toString(){
		return name;
	}
	@Override
	public int compareTo(Person person) {
		// TODO Auto-generated method stub
		//return -name.compareTo(person.name);
		
		//by string length
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2){
			return 1;
		}
		else if(len1 < len2){
			return -1;
		}
		else{
			
			return name.compareTo(person.name);
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}


public class App {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<String>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println("-------------------------------");
		
		showElements(set);
		System.out.println("-------------------------------");
		
		////////////////////////////////////////////////////////
		List<Person> list1 = new ArrayList<Person>();
		SortedSet<Person> set1 = new TreeSet<Person>();
		
		addElement(list1);
		addElement(set1);
		
		Collections.sort(list1);
		
		showElement(list1);
		System.out.println("-------------------------------");
		
		showElement(set1);
		System.out.println("-------------------------------");
	}
	
	private static void addElements(Collection<String> col){
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
	}
	
	private static void showElements(Collection<String> col){
		for(String element : col){
			System.out.println(element);
		}
	}
	
	///////////////////////////////
	private static void addElement(Collection<Person> col){
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clare"));
		col.add(new Person("Mike"));
	}
	
	private static void showElement(Collection<Person> col){
		for(Person element : col){
			System.out.println(element);
		}
	}
	

}
