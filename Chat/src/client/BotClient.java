package client;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import mainpackage.ConsoleHelper;

public class BotClient extends Client{
	
	public class BotSocketThread extends SocketThread{
        
		protected void clientMainLoop() throws IOException, ClassNotFoundException{
        	BotClient.this.sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
        	super.clientMainLoop();
        }
        
		protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            String[] messageParts = message.split(": ");
            if (messageParts.length == 2) {
                String messageAuthor = messageParts[0];
                String messageText = messageParts[1].toLowerCase();
                String dateTimeformat = null;
                switch (messageText) {
                    case "дата":
                        dateTimeformat = "d.MM.YYYY";
                        break;
                    case "день":
                        dateTimeformat = "d";
                        break;
                    case "месяц":
                        dateTimeformat = "MMMM";
                        break;
                    case "год":
                        dateTimeformat = "YYYY";
                        break;
                    case "время":
                        dateTimeformat = "H:mm:ss";
                        break;
                    case "час":
                        dateTimeformat = "H";
                        break;
                    case "минуты":
                        dateTimeformat = "m";
                        break;
                    case "секунды":
                        dateTimeformat = "s";
                        break;
                }
                if (dateTimeformat != null) {
                    String reply = String.format("Информация для %s: %s",
                            messageAuthor,
                            new SimpleDateFormat(dateTimeformat).format(Calendar.getInstance().getTime())
                    );
                    sendTextMessage(reply);
                }
            }
		}
	}
	
    protected SocketThread getSocketThread(){
    	return new BotSocketThread();
    }
	
    protected boolean shouldSendTextFromConsole(){
    	return false;
    }
    
    protected String getUserName() throws IOException{
    	return "date_bot_"+(int)(100*Math.random());
    }
	
	public static void main(String[] args) throws IOException {
		BotClient botClient = new BotClient();
		botClient.run();
	}
}
