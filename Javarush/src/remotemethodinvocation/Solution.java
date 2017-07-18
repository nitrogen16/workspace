package remotemethodinvocation;

import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

//реализация сервера в main
public class Solution {
	public static final String UNIC_BINDING_NAME = "server.reverse";

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(2499);
		
		// создание объекта для удаленного доступа
		final ReverseImpl service = new ReverseImpl();

		// создание реестра расшареных объектов
		final Registry registry = LocateRegistry.createRegistry(serverSocket.getLocalPort());
		
		// создание "заглушки" – приемника удаленных вызовов
		Remote stub = UnicastRemoteObject.exportObject(service, 0);
		
		// регистрация "заглушки" в реестре
		registry.bind(UNIC_BINDING_NAME, stub);

		// усыпляем главный поток, иначе программа завершится
		Thread.sleep(Integer.MAX_VALUE);
	}
}
//netstat -ano
//taskkill -pid 2684 /f