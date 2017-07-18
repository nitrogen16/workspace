import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Solution {
	public static void main(String[] args) {
		Solution app = new Solution();
		app.printThemAll();
	}

	private void printThemAll() {

		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = new FileInputStream("C:/Users/Viachaslau_Amelin/workspace/JustExamples/config.properties");
			
			if (input == null) {
				System.out.println("Sorry, unable to find " + input);
				return;
			}

			prop.load(input);

			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
