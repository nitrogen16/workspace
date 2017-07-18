
public class App {

	public static void main(String[] args) {
		
		//int value = 7;
		//value = value / 0;
		
		//String text = null;
		//System.out.println(text.length());
		
		String[] texts = {"one", "two", "three"};
		
		try{
			System.out.println(texts[3]);
		}
		catch(Exception e){
			System.out.println(e.toString());
		}

	}

}
