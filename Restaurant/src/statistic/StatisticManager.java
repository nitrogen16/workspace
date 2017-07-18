package statistic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import statistic.event.EventDataRow;
import statistic.event.EventType;

public class StatisticManager {
	private static StatisticManager instance = new StatisticManager();
	private StatisticStorage statisticStorage = new StatisticStorage();
	
	private StatisticManager() {

	}

	public static StatisticManager getInstance() {
		return instance;
	}
	
	public void register(EventDataRow data){
		statisticStorage.put(data);
	}
	
	private class StatisticStorage{
		Map<EventType, List<EventDataRow>> storage;
		public StatisticStorage() {
			this.storage = new HashMap<EventType, List<EventDataRow>>();
			for(EventType type : EventType.values()){
				storage.put(type, new ArrayList<EventDataRow>());
			}
		}
		private void put(EventDataRow data){
			storage.get(data.getType()).add(data);
		}
	}
}
