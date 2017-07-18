
public class Functions {
		
		//1
		static void myFunction() {
					System.out.println("Hello! I'm Function");
								}
		//2
		static void mFunction(int arg) {
			System.out.println("My argument = "+arg);
						}
		//3
		static void Result(int a, int b) {
			int result=a+b;
			System.out.println("Сумма параметров равна "+result);
						}
		//4
		static int Summary(int s, int d) {
			 int sum = s+d;
			return sum;
						}
		
	public static void main(String[] args) {
			//1
			myFunction();
			
			//2
			mFunction(56456);
			
			//3
			Result(23135, 25015);
			
			//4
			int var;
			var=Summary(250, 300);//var присваивается значение sum
			System.out.println("s + d = " + var);
	}

}
