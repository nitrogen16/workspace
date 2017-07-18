
public class Person {
		
	protected String name = "n/a";  //данные класса
	protected int age = 0;			//данные класса
	
	public void setName(String n){			//методы класса
						this.name = n;
							}
	
	public void setAge(int a){				//методы класса
						this.age = a;
						}
	
	public void descriptionOfPerson(){		//методы класса
		System.out.println("My name is " + name);
		System.out.println(" I'm " + age + " years old");
			}
	
}
