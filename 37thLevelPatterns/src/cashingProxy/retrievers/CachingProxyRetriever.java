package cashingProxy.retrievers;

import cashingProxy.cache.LRUCache;
import cashingProxy.storage.Storage;

public class CachingProxyRetriever implements Retriever{
    Storage storage;
    LRUCache lRUCache;
    OriginalRetriever originalRetriever;
    
    public CachingProxyRetriever(Storage storage) {
        this.storage = storage;
        this.originalRetriever = new OriginalRetriever(this.storage);
        lRUCache = new LRUCache<>(16);
    }
	@Override
	public Object retrieve(long id) {
		Object o = lRUCache.find(id);
		if(o == null){
			o = originalRetriever.retrieve(id);
			lRUCache.set(id, o);
		}
		return o;
	}
}
