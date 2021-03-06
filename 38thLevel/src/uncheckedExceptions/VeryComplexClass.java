package uncheckedExceptions;
/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
	public void methodThrowsClassCastException() {
		Object x = new Integer(0);
		System.out.println((String) x);
	}

	public void methodThrowsNullPointerException() {
		Object obj = null;
		obj.toString();
	}

	public static void main(String[] args) {
		qwe();
	}

	public static int qwe() {
		try {
			System.exit(0);
			return 1;
		} finally {
			
			return 0;
		}
	}
}