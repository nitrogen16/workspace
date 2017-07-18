package myMultiMap;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMultiMap<K, V> extends HashMap<K, V> implements Cloneable, Serializable {
    static final long serialVersionUID = 123456789L;
    private HashMap<K, List<V>> map;
    private int repeatCount;

    public MyMultiMap(int repeatCount) {
        this.repeatCount = repeatCount;
        map = new HashMap<>();
    }

    @Override
    public int size() {
        //напишите тут ваш код
    	int sizeFinal = 0;
    	for(java.util.Map.Entry<K, List<V>> pairs : map.entrySet()){
    		sizeFinal += pairs.getValue().size();
    	}
    	return sizeFinal;
    }

    @Override
    public V put(K key, V value) {
        //напишите тут ваш код
    	List<V> values = map.get(key);
    	V oldValue = null;
    	
    	if(values == null){
    		values = new ArrayList<>();
    	}else{
    		oldValue  = values.get(values.size() - 1);
            if (values.size() == repeatCount){
            	values.remove(0);
            }
    	}
        values.add(value);
        map.put(key, values);
        return oldValue;
    }

    @Override
    public V remove(Object key) {
        if (map.containsKey(key)) {
            List<V> list = map.get(key);
            if (list.size() == 1) {   // or 0
                map.remove(key);
                return list.get(0);
            }
            else {
                return list.remove(0);
            }
        } else return null;
}

    @Override
    public Set<K> keySet() {
        //напишите тут ваш код
    	return map.keySet();
    }

    @Override
    public Collection<V> values() {
        //напишите тут ваш код
    	List<V> list = new ArrayList<V>();
    	for(List<V> item : map.values()){
    		list.addAll(item);
    	}
    	return list;
    }

    @Override
    public boolean containsKey(Object key) {
        //напишите тут ваш код
    	if(map.containsKey(key)){
    		return true;
    	}else{
    		return false;
    	}
    }

    @Override
    public boolean containsValue(Object value) {
        //напишите тут ваш код
    	return values().contains(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append("=");
            for (V v : entry.getValue()) {
                sb.append(v);
                sb.append(", ");
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        return substring + "}";
    }
}