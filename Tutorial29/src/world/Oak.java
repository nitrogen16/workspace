package world;


public class Oak extends Plant{
	
	public Oak(){
		
		//Won't work cause type is private
		//type = "tree";
		
		//size is protected
		this.size = "medium";
		
		//no access specifier. Works cause Plant and Oak are in the same package
		this.height = 10;
	}
}
