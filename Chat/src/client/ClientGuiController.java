package client;

import java.io.IOException;

public class ClientGuiController extends Client{
	private ClientGuiModel model;
	private ClientGuiView view;
	
    public ClientGuiController() {
        model = new ClientGuiModel();
        view = new ClientGuiView(this);
    }
	
	public ClientGuiModel getModel(){
		return model;
	}
	
	public class GuiSocketThread extends SocketThread{
    	protected void processIncomingMessage(String message){
    		model.setNewMessage(message);
    		view.refreshMessages();
    	}
    	protected void informAboutAddingNewUser(String userName){
    		model.addUser(userName);
    		view.refreshUsers();
    	}
    	protected void informAboutDeletingNewUser(String userName){
    		model.deleteUser(userName);
    		view.refreshUsers();
    	}
    	protected void notifyConnectionStatusChanged(boolean clientConnected){
			view.notifyConnectionStatusChanged(clientConnected);
    	}
	}
	
    protected SocketThread getSocketThread(){
    	return new GuiSocketThread();
    }
    
    public void run() throws IOException{
    	SocketThread socket = getSocketThread();
    	socket.run();
    }
    
	protected String getServerAddress() throws IOException{
    	return view.getServerAddress();
    }
    
    protected int getServerPort() throws NumberFormatException, IOException{
    	return view.getServerPort(); 
    }
    
    protected String getUserName() throws IOException{
    	return view.getUserName();
    }
    
	public static void main(String[] args) throws IOException {
		ClientGuiController clientGuiController = new ClientGuiController();
		clientGuiController.run();
	}
	
}
