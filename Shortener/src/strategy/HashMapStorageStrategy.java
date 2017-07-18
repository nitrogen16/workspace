package strategy;

import java.util.HashMap;
import java.util.Map;

public class HashMapStorageStrategy implements StorageStrategy{

	private HashMap<Long, String> data = new HashMap<Long, String>();
	
	@Override
	public boolean containsKey(Long key) {
		if(data.containsKey(key)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean containsValue(String value) {
		if(data.containsValue(value)){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public void put(Long key, String value) {
		data.put(key, value);
	}

	@Override
	public Long getKey(String value) {
        Long res = 0l;
		for (Map.Entry entry : data.entrySet()) {
            if (entry.getValue().equals(value)) {
                res = (Long) entry.getKey();
            }
        }
		return res;
	}

	@Override
	public String getValue(Long key) {
		return data.get(key);
	}

}
