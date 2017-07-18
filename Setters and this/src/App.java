class Frog{
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setInfo(String name, int age){
		this.setName(name);// not necessary
		setAge(age);
		System.out.println("I'm frog. Call me " + name + ". I'm of " + age + " years old.");
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		//frog1.name = "Berthie";
		//frog1.age = 1;
		
		frog1.setName("Frooooooooooooooooog");
		frog1.setAge(1351351);
		
		System.out.println(frog1.getName());
		System.out.println(frog1.getAge());
		
		Frog frog2 = new Frog();
		frog2.setInfo("Samons", 25);
		
	}

}
