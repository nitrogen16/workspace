
public class Person implements Info{

	private String name;
	
	
	public Person(String name) {
		super();// cause Person is a child of Object class which is a MAIN PARENT in Java
		this.name = name;
	}


	public void greet(){
		System.out.println("Hello there! " + name);
	}
	
	public void showInfo() {
		System.out.println("Person name is  " + name);
	}
}
