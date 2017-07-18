import world.Plant;

public class Grass extends Plant{
	public Grass(){
		//even though it's a subclass -- Grass is in the other package
		//System.out.println(this.height);
		this.size = "Grass size is too small";
		System.out.println(size.toString());
	}
	/*public String toString(){
		/*
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
		//return String.format(size);
	//}
}
