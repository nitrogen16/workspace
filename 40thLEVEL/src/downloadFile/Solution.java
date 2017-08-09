package downloadFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;

public class Solution {

	public static void main(String[] args) throws IOException {
//		URL url = new URL("https://www.google.com.ua/images/srpr/logo11w.png");
//		URLConnection connection = url.openConnection(); //устанавливаем соединение
//
//		//получаем OutputStream, чтобы писать в него данные запроса
//		//OutputStream outputStream = connection.getOutputStream();
//		//outputStream.write(1);
//		//outputStream.flush();
//
//		//получаем InputStream, чтобы читать из него данные ответа
//		InputStream inputStream = connection.getInputStream();
//		Files.copy(inputStream, new File("d:/google1.png").toPath());`
//		
		URL url1 = new URL("https://www.epam.com/content/dam/epam/solutions/Advance_Tech.jpeg.transform/resize_w_480/image.jpeg");
		InputStream inputStream1 = url1.openStream();
		Files.copy(inputStream1, new File("d:/epam1.jpeg").toPath());
	}

}
