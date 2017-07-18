package mainpackage;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
	private static Map<String, Connection> connectionMap = new ConcurrentHashMap<String, Connection>();
	
	public static void sendBroadcastMessage(Message message){
		for(String clientName : connectionMap.keySet()){
			try{
				connectionMap.get(clientName).send(message);
			}catch(IOException e){
				ConsoleHelper.writeMessage("Невозможно отправить сообщение клиенту с именем " + clientName);
			}
		}
	}
	
	private static class Handler extends Thread{
		private Socket socket;
		
		public Handler(Socket socket) {
			this.socket = socket;
		}
		
		private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
			boolean accepted = false;
			String name = null;
			while(!accepted){
				connection.send(new Message(MessageType.NAME_REQUEST));
				Message message = connection.receive();
				if(message.getType() == MessageType.USER_NAME){
					name = message.getData();
					if(!name.isEmpty() && connectionMap.get(name) == null){
						connectionMap.put(name, connection);
						connection.send(new Message(MessageType.NAME_ACCEPTED));
						accepted = true;
					}
				}
			}
			return name;
		}
		
		private void sendListOfUsers(Connection connection, String userName) throws IOException{
			for(String clientName : connectionMap.keySet()){
				if(!clientName.equals(userName)){
					connection.send(new Message(MessageType.USER_ADDED, clientName));
				}
			}
		}
		
		private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
			while(true){
				Message message = connection.receive();
				if(message.getType() == MessageType.TEXT){
					sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
				}else{
					System.out.println("Сообщение не является текстом!");
				}
			}
		}
		
		public void run(){
			ConsoleHelper.writeMessage("Установлено соединение с " + socket.getRemoteSocketAddress());
			String clientName = null;
			try {
				Connection connection = new Connection(socket);
				clientName = serverHandshake(connection);
				sendBroadcastMessage(new Message(MessageType.USER_ADDED, clientName));
				sendListOfUsers(connection, clientName);
				serverMainLoop(connection, clientName);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			if(clientName != null){
				connectionMap.remove(clientName);
				sendBroadcastMessage(new Message(MessageType.USER_REMOVED, clientName));
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        ConsoleHelper.writeMessage("Введите порт сервера:");
        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            ConsoleHelper.writeMessage("Сервер запущен на порту: " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                new Handler(socket).start();
            }
        } catch (IOException e) {
            ConsoleHelper.writeMessage(e.getMessage());
        }
	}
}
