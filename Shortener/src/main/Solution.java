package main;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import strategy.HashMapStorageStrategy;
import strategy.StorageStrategy;

public class Solution {

	public static void main(String[] args) {
	    StorageStrategy strategy = new HashMapStorageStrategy();
	    testStrategy(strategy, 10000);
	}
	
	public static Set<Long> getIds(Shortener shortener, Set<String> strings){
		Set<Long> set = new HashSet<Long>();
		for(String item : strings){
			set.add(shortener.getId(item));
		}
		return set;
	}
	
	public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
		Set<String> set = new HashSet<String>();
		for(Long item : keys){
			set.add(shortener.getString(item));
		}
		return set;
	}
	
	public static void testStrategy(StorageStrategy strategy, long elementsNumber){
		Helper.printMessage(strategy.getClass().getSimpleName());
		
		Set<String> setStrings = new HashSet<>();
		for(int i = 0; i < elementsNumber; i++){
			setStrings.add(Helper.generateRandomString());
		}
		
		Shortener shortener = new Shortener(strategy);
		
		long t1 = new Date().getTime();
	    Set<Long> keys = getIds(shortener, setStrings);
	    Helper.printMessage(String.valueOf(new Date().getTime() - t1));
	    long t2 = new Date().getTime();
	    Set<String> stringSet = getStrings(shortener, keys);
	    Helper.printMessage(String.valueOf(new Date().getTime() - t2));

	    if (setStrings.size()== stringSet.size() && setStrings.containsAll(stringSet)) {
	        Helper.printMessage("Тест пройден.");
	    } else {
	        Helper.printMessage("Тест не пройден.");
	    }
	}
}
