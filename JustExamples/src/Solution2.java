import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Solution2 {

	public static void main(String[] args) throws FileNotFoundException {
		// Определяем файл в который будем писать лог
		System.setErr(new PrintStream(new File("log.txt")));
		// Выводим сообщения
		System.err.println("Сообщение 1");
		System.err.println("Сообщение 2");
		// Выводим сообщение об ошибке
		try {
		     throw new Exception("Сообщение об ошибке");
		} catch (Exception e) {
		     e.printStackTrace();
		}

	}

}