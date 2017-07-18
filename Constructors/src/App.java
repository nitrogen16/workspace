class Machine{
	private String name;
	private int code;
	
	public Machine(){
		this("Arnie", 0);// calling the 3rd constructor
		System.out.println("Consctructor is running!");
	}
	
	public Machine(String name){
		System.out.println("Second constructor is running!");
		this.name = name;
	}
	
	public Machine(String name, int code){
		System.out.println("Third constructor is running!");
		this.name = name;
		this.code = code;
	}
}


public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Berthie");
		
		Machine machine3 = new Machine("Chalky", 7);
		
		//new Machine();

	}

}
