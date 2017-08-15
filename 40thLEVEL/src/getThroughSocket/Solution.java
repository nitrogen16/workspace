package getThroughSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;

/* 
Отправка GET-запроса через сокет
*/

public class Solution {
	public static void main(String[] args) throws Exception {
		getSite(new URL("http://baraholka.onliner.by/search.php?q=mi+max+2"));
	}

	public static void getSite(URL url) {
		try {

			String host = url.getHost();
			int port = url.getDefaultPort();

			System.out.println(host);
			System.out.println(port);
			System.out.println(url.getFile());
			System.out.println("//////////////////////////////////////////////////////");

			@SuppressWarnings("resource")
			Socket socket = new Socket(host, port);

			// получаем OutputStream, чтобы писать в него данные запроса
			OutputStream outputStream = socket.getOutputStream();
			String request = "GET " + url.getFile() + " HTTP/1.1\\r\\n";
			request += "Host: "+url.getHost()+"\r\n\r\n";
			outputStream.write(request.getBytes());
			outputStream.flush();

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String responseLine;

			while ((responseLine = bufferedReader.readLine()) != null) {
				System.out.println(responseLine);
			}
			bufferedReader.close();
			outputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}