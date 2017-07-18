
public class App {

	public static void main(String[] args) {

		byte byteValue = 20;
		short shortValue = 55;
		int intValue = 320000;
		long longValue = 9223372;
		
		float floatValue = 8834.8f;
		float floatValue2 = (float)99.3;
		double doubleValue = 32.4;
		
		System.out.println(Long.MAX_VALUE);
		
		intValue = (int)longValue;
		System.out.println(intValue);
		
		shortValue = (short)intValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		byteValue = (byte)128;
		System.out.println(byteValue);
	}

}
