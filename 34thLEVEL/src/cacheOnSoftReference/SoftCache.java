package cacheOnSoftReference;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SoftCache {
    private Map<Long, SoftReference<AnyObject>> cacheMap = new ConcurrentHashMap<>();

    public AnyObject get(Long key) {
        SoftReference<AnyObject> softReference = cacheMap.get(key);
		if(softReference == null){
			return null;
		}else{
			return softReference.get();
		}
    }

    public AnyObject put(Long key, AnyObject value) {
    	if(cacheMap.get(key) == null){
    		return null;
    	}
    	SoftReference<AnyObject> softReferenceBLA =  new SoftReference<AnyObject>(cacheMap.get(key).get());
    	SoftReference<AnyObject> softReference = cacheMap.put(key, new SoftReference<>(value));
    	softReference.clear();	
    	return softReferenceBLA.get();
    }

    public AnyObject remove(Long key) {
    	if(cacheMap.get(key) == null){
			return null;
		}
		SoftReference<AnyObject> softReferenceBLA =  new SoftReference<AnyObject>(cacheMap.get(key).get());
    	SoftReference<AnyObject> softReference = cacheMap.remove(key);
    	softReference.clear();
    	return softReferenceBLA.get();
    }
}