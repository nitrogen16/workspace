package world;

public class Plant {
	// Bad practice. Public variable is not OK
	public String name;
	
	// Better way is constant. Acceptable practice --- it's final
	public final static int ID = 100;
	
	private String type;//N/A in child classes
	
	protected String size;
	
	//package level visibility
	int height;
	
	public Plant(){
		this.name = "Freddy";
		
		this.type = "plant";
		
		//available within the same package, subclass, and class
		this.size = "LARGE";
		
		this.height = 8;
	}
	
}
