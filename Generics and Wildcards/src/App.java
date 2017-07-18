import java.util.ArrayList;

class Machine{
	@Override
	public String toString() {
		//return "Machine [toString()=" + super.toString() + "]";
		return "I am a machine";
	}
	
	public void start(){
		System.out.println("Machine is starting...");
	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		//return "Machine [toString()=" + super.toString() + "]";
		return "I am a CAMERA";
	}
	public void snap(){
		System.out.println("SNAP!!!");
	}
}

public class App {

	public static void main(String[] args) {
		
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list1);
		showList(list2);
	}
	
	public static void showList(ArrayList<? extends Machine> list){
		for(Machine value : list){
			System.out.println(value);
			value.start();
			//value.snap(); only Machine methods are available
		}
	}
		
	public static void showList2(ArrayList<? super Camera> list){
		for(Object value : list){
			System.out.println(value);
		}
			
		
	}

}
