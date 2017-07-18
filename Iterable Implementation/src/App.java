
public class App {

	public static void main(String[] args) {
		
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String html : urlLibrary){
			
			//number of characters returning from a specific web site
			System.out.println(html.length());
			
			//System.out.println(url);
		}

	}

}
