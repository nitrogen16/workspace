import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class App {

	public static void main(String[] args) {
		// ArrayList vs LinkedList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		doSmth("ArrayList", arrayList);
		doSmth("LinkedList", linkedList);

	}

	private static void doSmth(String type, List<Integer> list){
		long start = System.currentTimeMillis();
		//add at the end of the list
		/*
		for(int i = 0; i < 15000000; i++){
			list.add(i);
		}*/
		//add elsewhere
		for(int i = 0; i < 150000; i++){
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " + (end - start) + "ms for " + type);
	}
}
