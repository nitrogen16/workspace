class Plant{
	
	public static final int ID = 7;
	
	private String name;

	public String getData(){
		String data = "some stuff " + calcGrowth();
		return data;
	}
	
	private int calcGrowth(){
		return 9;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class App {

	public static void main(String[] args) {
		
		

	}

}
