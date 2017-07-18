import java.util.HashMap;
import java.util.Map;



public class App {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(3, "Three");
		
		map.put(6, "Hello!!! I rewrote a key");
		
		System.out.println(map);
		
		String text = map.get(6);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}

}
