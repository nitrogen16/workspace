package urlInternals;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/* 
Свойства URL
*/

public class Solution {
	public static void main(String[] args) throws IOException {
		decodeURLString("https://www.amrood.com/index.htm?language=en#j2se");
		System.out.println("///////////////////////////////////////////////");
		decodeURLString("http://baraholka.onliner.by/search.php?q=mi+max+2&by=price&topicTitle=1&sort=desc");
	}

	public static void decodeURLString(String s) throws MalformedURLException {
		try {
			URL url = new URL(s);
	    	System.out.println(url.getProtocol());
	    	System.out.println(url.getAuthority());
	    	System.out.println(url.getHost());
	    	System.out.println(url.getFile());
	    	System.out.println(url.getPath());
	    	System.out.println(url.getPort());
	    	System.out.println(url.getDefaultPort());
	    	System.out.println(url.getQuery());
	    	System.out.println(url.getRef());
		}catch(MalformedURLException e) {
			System.out.println(String.format("Parameter %s is not a valid URL", s));
		}
    }
}
