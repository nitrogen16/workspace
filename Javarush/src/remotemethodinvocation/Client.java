package remotemethodinvocation;

import java.net.ServerSocket;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static final String UNIC_BINDING_NAME = "server.reverse";

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(2499);
		
		// создание реестра расшареных объетов
		final Registry registry = LocateRegistry.getRegistry(serverSocket.getLocalPort());

		// получаем объект (на самом деле это proxy-объект)
		Reverse service = (Reverse) registry.lookup(UNIC_BINDING_NAME);

		// Вызываем удаленный метод
		String result1 = service.reverse("Home sweet home.");
		String result2 = service.reverse("Home sweet home.");
		System.out.println(result1);
		System.out.println(result2);
		serverSocket.close();
	}

}
