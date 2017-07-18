class Frog{
	
	private int id;
	private String name;
	
	public Frog (int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString(){
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		return String.format("%4d: %s", id, name);
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frog frog1 = new Frog(8, "Freddy");
		Frog frog2 = new Frog(15, "Bob");
		
		System.out.println(frog1);
		System.out.println(frog2);
	
		
		
		

	}

}
