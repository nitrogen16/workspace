
public class App {

	public static void main(String[] args) {
		
		class SonOfBoo extends Boo{

			public SonOfBoo() {
				super("boo");
				// TODO Auto-generated constructor stub
			}
			
			public SonOfBoo(int i) {
				super("Fred");
				//System.out.println(getClass());
				//System.out.println(i);
				// TODO Auto-generated constructor stub
			}
			
			public SonOfBoo(String s) {
				super(42);
				// TODO Auto-generated constructor stub
			}
			
			public SonOfBoo(int i, String s) {

			}
			
			public SonOfBoo(String a, String b, String c) {
				super(a, b);
				// TODO Auto-generated constructor stub
			}
			
			public SonOfBoo(int i, int j) {
				super("man", j);
				System.out.println(i + j);
				// TODO Auto-generated constructor stub
			}
			
			public SonOfBoo(int i, int x, int y) {
				super(i ,"star");
				// TODO Auto-generated constructor stub
			}
		}
		SonOfBoo h1 = new SonOfBoo();
		SonOfBoo h2 = new SonOfBoo(234);
		SonOfBoo h3 = new SonOfBoo("Hi");
		SonOfBoo h4 = new SonOfBoo(2, 5);

		
		System.out.println("Getting an h class: " + h1.getClass());
		System.out.println("Getting an h class: " + h2.getClass());
		System.out.println("Getting an h class: " + h3.getClass());
		System.out.println("Getting an h class: " + h4.getClass());

	}

}
