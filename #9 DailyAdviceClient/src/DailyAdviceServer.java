import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class DailyAdviceServer {
	
	String[] adviceList = {"Eat less", "Buy jeans", "Looks good", "Well... It's not appropriate enogh"};
	
	public void go(){
		try {
			ServerSocket serverSock = new ServerSocket(4242);
			while(true){
				Socket sock = serverSock.accept();
				
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
					
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getAdvice(){
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}
	
}