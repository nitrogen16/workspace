package remotemethodinvocation.example1;

import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Solution {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    //pretend we start rmi client as CLIENT_THREAD thread
    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            //напишите тут ваш код
        	try {
				DoubleString client = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
				String result = client.doubleString("Hello World!");
				System.out.println(result);
			} catch (AccessException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (NotBoundException e) {
				e.printStackTrace();
			}
        }
    });

    public static void main(String[] args) {
        //pretend we start rmi server as main thread
        Remote stub = null;
        try {
            registry = LocateRegistry.createRegistry(3501);
            final DoubleStringImpl service = new DoubleStringImpl();

            stub = UnicastRemoteObject.exportObject(service, 0);
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }

        //start client
        CLIENT_THREAD.start();
    }
}
//netstat -ano
//taskkill -pid 2684 /f