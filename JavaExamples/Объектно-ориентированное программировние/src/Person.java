
public class Person {
		
	protected String name = "n/a";  //������ ������
	protected int age = 0;			//������ ������
	
	public void setName(String n){			//������ ������
						this.name = n;
							}
	
	public void setAge(int a){				//������ ������
						this.age = a;
						}
	
	public void descriptionOfPerson(){		//������ ������
		System.out.println("My name is " + name);
		System.out.println(" I'm " + age + " years old");
			}
	
}
