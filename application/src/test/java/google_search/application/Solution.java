package google_search.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("1 - Chrome\n2 - FireFox");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			int number = Integer.parseInt(reader.readLine());
				if(number == 1){
					Browser b1 = TestFabric.createTest(BrowserName.CHROME);
				}else if(number == 2) {
					Browser b2 = TestFabric.createTest(BrowserName.MOZILLA);
				}
			reader.close();
	}

}
