package main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CurrencyManipulatorFactory {
	
	private static Map<String, CurrencyManipulator> map = new HashMap<String, CurrencyManipulator>();
	static boolean isExist = false;
	
	private CurrencyManipulatorFactory() {
		
	}

	public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode) {
		isExist = false;
		CurrencyManipulator current;
		if(map.containsKey(currencyCode)) {
			return map.get(currencyCode);
		}else {
			current = new CurrencyManipulator(currencyCode);
			map.put(currencyCode, current);
			return current;
		}
	}
	
	public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
		return map.values();
	}
}
