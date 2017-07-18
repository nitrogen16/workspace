package securityProxy.connectors;

import securityProxy.security.SecurityChecker;
import securityProxy.security.SecurityCheckerImpl;

public class SecurityProxyConnector implements Connector{
	SimpleConnector simpleConnector;
	SecurityChecker securityChecker;
	
	public SecurityProxyConnector(String s) {
		this.simpleConnector = new SimpleConnector(s);
		this.securityChecker = new SecurityCheckerImpl();
	}

	@Override
	public void connect() {
		if(securityChecker.performSecurityCheck() == true){
			simpleConnector.connect();
		}else{
			System.out.println("Access Denied");
		}
	}
}
