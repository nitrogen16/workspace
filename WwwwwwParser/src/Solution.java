
public class Solution {

	public static void main(String[] args) {
		String words = " Alabama " + 
				"Alaska " + 
				"Arizona " + 
				"Arkansas " + 
				"California " + 
				"Colorado " + 
				"Connecticut " + 
				"Delaware " + 
				"District of Columbia" + 
				"Florida " + 
				"Georgia " + 
				"Guam" + 
				"Hawaii " + 
				"Idaho " + 
				"Illinois " + 
				"Indiana " + 
				"Iowa " + 
				"Kansas " + 
				"Kentucky " + 
				"Louisiana " + 
				"Maine " + 
				"Maryland " + 
				"Massachusetts " + 
				"Michigan " + 
				"Minnesota " + 
				"Mississippi " + 
				"Missouri " + 
				"Montana " + 
				"Nebraska " + 
				"Nevada " + 
				"New Hampshire " + 
				"New Jersey " + 
				"New Mexico " + 
				"New York " + 
				"North Carolina " + 
				"North Dakota " + 
				"Ohio " + 
				"Oklahoma " + 
				"Oregon " + 
				"Pennsylvania " + 
				"Puerto Rico" + 
				"Rhode Island " + 
				"South Carolina " + 
				"South Dakota " + 
				"Tennessee " + 
				"Texas " + 
				"Utah " + 
				"Vermont " + 
				"Virgin Islands" + 
				"Virginia " + 
				"Washington " + 
				"West Virginia " + 
				"Wisconsin " + 
				"Wyoming ";
//		parseString(words);
		words = words.replaceAll(" ", "','");
		System.out.println(words);
	}

	private static void parseString(String words) {
		// TODO Auto-generated method stub
		if(words.contains(" ")) {
			
		}
		
	}

}