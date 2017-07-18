package remotemethodinvocation;

import java.rmi.RemoteException;
//сурверный класс
class ReverseImpl implements Reverse {
	public String reverse(String str) throws RemoteException {
		return new StringBuffer(str).reverse().toString();
	}
}
