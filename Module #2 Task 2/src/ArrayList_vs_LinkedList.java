import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayList_vs_LinkedList {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		addElement("ArrayList", arrayList);
		
		for(Integer item : arrayList){
			System.out.println(arrayList.get(item));
		}
		
		showElement("ArrayList", arrayList);
		deleteElement("ArrayList", arrayList);
		
		System.out.println();
		
		addElement("LinkedList", linkedList);
		showElement("LinkedList", linkedList);
		deleteElement("LinkedList", linkedList);
		
		for(int i = 0; i < arrayList.size(); i++){
			long start = System.currentTimeMillis();
			arrayList.get(i);
			long end = System.currentTimeMillis();
			System.out.println("Mana mana " +(end - start) + "ms for ");
		}
	}

	private static void addElement(String type, List<Integer> list){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 250000; i++){
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding elements time: " + (end - start) + "ms for " + type);
	}
	
	
	private static void showElement(String type, List<Integer> list){
		long start = System.currentTimeMillis();
		System.out.print(list.get(105000) + " element");
		long end = System.currentTimeMillis();
		System.out.println(". Time for searching is: " +(end - start) + "ms for " + type);
	}
	
	private static void deleteElement(String type, List<Integer> list){
		long start = System.currentTimeMillis();
		list.removeAll(list);
		long end = System.currentTimeMillis();
		System.out.println("Deleting elements time: " + (end - start) + "ms for " + type);
	}
}
