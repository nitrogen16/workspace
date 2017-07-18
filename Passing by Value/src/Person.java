
public class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override //Otherwise it'll look like Person@6ce253f1
	public String toString(){
		return "Person [name = " + name + "]";
	}
	
}
