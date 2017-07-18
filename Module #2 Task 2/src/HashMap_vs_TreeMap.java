import java.util.HashMap;
import java.util.TreeMap;


public class HashMap_vs_TreeMap {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		addHashMapElement("HashMap type", hashMap1);
		showHashMapElement("HashMap type", hashMap1);
		deleteHashMapElement("HashMap type", hashMap1);

		System.out.println("------------------------------------------------------------------");
		
		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>();
		addTreeMapElement("TreeMap type", treeMap1);
		showTreeMapElement("TreeMap type", treeMap1);
		deleteTreeMapElement("TreeMap type", treeMap1);
	}

	private static void addHashMapElement(String type, HashMap<Integer, String> hashMap) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			hashMap.put(i, i + " element");
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding elements time: " + (end - start) + "ms for " + type);
	}
	
	private static void showHashMapElement(String type, HashMap<Integer, String> hashMap) {
		long start = System.currentTimeMillis();
		if(hashMap.containsValue("555555 element")){
		System.out.print("True");	
		}
		long end = System.currentTimeMillis();
		System.out.println(". Time for searching element is " +(end - start) + "ms for " + type);
	}
	
	private static void deleteHashMapElement(String type, HashMap<Integer, String> hashMap) {
		long start = System.currentTimeMillis();
		hashMap.remove(hashMap);
		long end = System.currentTimeMillis();
		System.out.println("Deleting elements time: " + (end - start) + "ms for " + type);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	private static void addTreeMapElement(String type, TreeMap<Integer, String> treeMap) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			treeMap.put(i, i + " element");
		}
		long end = System.currentTimeMillis();
		System.out.println("Adding elements time: " + (end - start) + "ms for " + type);
	}
	
	private static void showTreeMapElement(String type, TreeMap<Integer, String> treeMap) {
		long start = System.currentTimeMillis();
		if(treeMap.containsValue("555555 element")){
		System.out.print("True");	
		}
		long end = System.currentTimeMillis();
		System.out.println(". Time for searching element is " +(end - start) + "ms for " + type);
	}
	
	private static void deleteTreeMapElement(String type, TreeMap<Integer, String> treeMap) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < treeMap.size(); i++){
			treeMap.remove(treeMap.firstKey());
		}
		long end = System.currentTimeMillis();
		System.out.println("Deleting elements time: " + (end - start) + "ms for " + type);
	}
}
