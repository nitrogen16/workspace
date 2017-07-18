
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = " to";
		words[2] = " you";
		System.out.println(words[2]);
		
		String[] fruits = {"apple", "banana", "pear", "kiwi"};
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		
		int value = 123;
		
		String text = null; //null by default
		
		String[] texts = new String [2];
		System.out.println(texts[0]);
		texts[0] = "one";
	}
}
