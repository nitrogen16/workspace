class Person{
	// Instance variables (data or state)
	String name;
	int age;
	
	// Classes can contain
	// 1. Data
	// 2. Subroutines aka Methods
	
	void speak(){
		for(int i = 0; i < 3; i++){
		System.out.println("Hello " + name +" of "+ age + " years old.");
		}
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		person1.name = "Joe Black";
		person1.age = 37;
		
		Person person2 = new Person();
		person2.name = "Geremy Ckarkson";
		person2.age = 55;
		
		System.out.println(person1.name + "\t" + person1.age);
		
		person1.speak();
		person1.sayHello();
		person2.speak();
	}

}
