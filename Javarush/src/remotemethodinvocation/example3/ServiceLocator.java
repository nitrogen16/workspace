package remotemethodinvocation.example3;

import remotemethodinvocation.example3.contex.InitialContext;
import remotemethodinvocation.example3.service.Service;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * First check the service object available in cache
     * If service object not available in cache do the lookup using
     * JNDI initial context and get the service object. Add it to
     * the cache for future use.
     *
     * @param jndiName The name of service object in context
     * @return Object mapped to name in context
     */
    public static Service getService(String jndiName) {
    	if(cache.getService(jndiName) == null){
    		InitialContext initialContext = new InitialContext();
    		Service service = (Service) initialContext.lookup(jndiName);
    		cache.addService(service);
    		return service;
    	}else{
    		return cache.getService(jndiName);
    	}
    }
}
