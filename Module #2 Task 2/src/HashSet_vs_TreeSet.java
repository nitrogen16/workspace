import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class HashSet_vs_TreeSet {

	public static void main(String[] args) throws InterruptedException {
		
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
		
		addHashSetElement("HashSet", hashSet1);
		showHashSetElement("HashSet", hashSet1);
		deleteHashSetElement("HashSet", hashSet1);
		
		System.out.println("------------------------------------------------------------------");
		
		addTreeSetElement("TreeSet", treeSet1);
		showTreeSetElement("TreeSet", treeSet1);
		deleteTreeSetElement("TreeSet", treeSet1);
	}

	private static void addHashSetElement(String type, HashSet<Integer> hashSet){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 550000; i++){
			hashSet.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding elements time: " + (end - start) + "ms for " + type);
	}
	
	private static void showHashSetElement(String type, HashSet<Integer> hashSet){
		long start = System.currentTimeMillis();
		
		Iterator<Integer> it = hashSet.iterator();
		while(it.hasNext()){
			if(it.next() == 250001){
				System.out.print("True. The element was found");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(". Time for searching element is " +(end - start) + "ms for " + type);
	}
	
	private static void deleteHashSetElement(String type, HashSet<Integer> hashSet){
		long start = System.currentTimeMillis();
		hashSet.removeAll(hashSet);
		long end = System.currentTimeMillis();
		System.out.println("Deleting elements time: " + (end - start) + "ms for " + type);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	private static void addTreeSetElement(String type, TreeSet<Integer> treeSet1){
		long start = System.currentTimeMillis();
		for(int i = 0; i < 550000; i++){
			treeSet1.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding elements time: " + (end - start) + "ms for " + type);
	}
	
	private static void showTreeSetElement(String type, TreeSet<Integer> treeSet){
		long start = System.currentTimeMillis();
		Iterator<Integer> it = treeSet.iterator();
		while(it.hasNext()){
			if(it.next() == 250001){
				System.out.print("True. The element was found.");
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(". Time for searching element is " +(end - start) + "ms for " + type);
	}
	
	private static void deleteTreeSetElement(String type, TreeSet<Integer> treeSet1){
		long start = System.currentTimeMillis();
		treeSet1.removeAll(treeSet1);
		long end = System.currentTimeMillis();
		System.out.println("Deleting elements time: " + (end - start) + "ms for " + type);
	}
}
