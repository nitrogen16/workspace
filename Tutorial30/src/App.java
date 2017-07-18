
public class App {

	public static void main(String[] args) {
		
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		
		plant2.grow();
		
		tree.shedLeaves();
		
		//doGrow(tree);
		//doGrow(plant1);
	}
	
	public static void doGrow(Plant plant){
		plant.grow();
	}

}
