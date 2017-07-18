package client;
import java.io.IOException;
import java.net.Socket;

import mainpackage.Connection;
import mainpackage.ConsoleHelper;
import mainpackage.Message;
import mainpackage.MessageType;

public class Client {
    public Connection connection;
    private volatile boolean clientConnected = false;
    
    public class SocketThread extends Thread{
    	protected void processIncomingMessage(String message){
    		ConsoleHelper.writeMessage(message);
    	}
    	protected void informAboutAddingNewUser(String userName){
    		ConsoleHelper.writeMessage("Добавлен новый пользователь: " + userName);
    	}
    	protected void informAboutDeletingNewUser(String userName){
    		ConsoleHelper.writeMessage(userName + " покинул чат");
    	}
    	protected void notifyConnectionStatusChanged(boolean clientConnected){
			Client.this.clientConnected = clientConnected;
    		synchronized(Client.this){
        		Client.this.notify();
    		}
    	}
        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST) {
                    Message m = new Message(MessageType.USER_NAME, getUserName());
                    connection.send(m);
                } else if (message.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    break;
                } else {
                    throw new IOException("Unexpected MessageType");
                }
            }
        }
        
        protected void clientMainLoop() throws IOException, ClassNotFoundException{
        	while(true){
        		Message message = connection.receive();
            	if(message.getType() == MessageType.TEXT){
            		processIncomingMessage(message.getData());
            	}
            	else if(message.getType() == MessageType.USER_ADDED){
            		informAboutAddingNewUser(message.getData());
            	}
            	else if(message.getType() == MessageType.USER_REMOVED){
            		informAboutDeletingNewUser(message.getData());
            	}else{
            		throw new IOException("Unexpected MessageType");
            	}
        	}
        }
        
        public void run(){
        	try {
				String serverAddress = getServerAddress();
				int port = getServerPort();
				Socket socket = new Socket(serverAddress, port);
				Client.this.connection = new Connection(socket);
				clientHandshake();
				clientMainLoop();
			} catch (IOException e) {
				notifyConnectionStatusChanged(false);
			} catch (ClassNotFoundException e) {
				notifyConnectionStatusChanged(false);
			}
        }
    }
    
	protected String getServerAddress() throws IOException{
    	ConsoleHelper.writeMessage("Введите адрес сервера: ");
    	return ConsoleHelper.readString();
    }
    
    protected int getServerPort() throws NumberFormatException, IOException{
    	ConsoleHelper.writeMessage("Введите порт сервера: ");
    	return ConsoleHelper.readInt(); 
    }
    
    protected String getUserName() throws IOException{
    	ConsoleHelper.writeMessage("Введите имя пользователя:");
    	return ConsoleHelper.readString();
    }
    
    protected boolean shouldSendTextFromConsole(){
    	return true;
    }
    
    protected SocketThread getSocketThread(){
    	return new SocketThread();
    }
    
    protected void sendTextMessage(String text){
    	try{
    		connection.send(new Message(MessageType.TEXT, text));
    	}catch(IOException e){
    		clientConnected = false;
    		ConsoleHelper.writeMessage("Ошибка при отправке сообщения. Соединение будет закрыто.");
    	}
    	
    }
    
    public void run() throws IOException{
    	SocketThread socket = getSocketThread();
    	socket.setDaemon(true);
    	socket.start();
    	synchronized(this){
    		try {
    			this.wait();
    		} catch (InterruptedException e) {
    			ConsoleHelper.writeMessage("Возникло исключение!");
    		}
    	}
    	while(clientConnected){
    		String text = ConsoleHelper.readString();
    		if(text.equals("exit")){
    			break;
    		}
    		if(shouldSendTextFromConsole()){
    			sendTextMessage(text);
    		}
    	}
    }
    public static void main(String[] args) throws IOException {
		Client client = new Client();
		client.run();
	}
    
}