import world.Plant;


public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// type is private
		//System.out.println(plant.type);
		
		//size is protected and in the other package
		//Won't work
		//System.out.println(plant.size);
		
		//Won't work. Different packages
		//System.out.println(plant.height);
		
		Grass grass = new Grass();
		//System.out.println(grass);
		
		
	}

}
