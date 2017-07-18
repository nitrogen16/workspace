package statistic.event;


import java.util.Date;
import java.util.List;

import kitchen.Dish;

public class CookedOrderEventDataRow implements EventDataRow{
	private String tabletName;
	private String cookName;
	private int cookingTimeSeconds;
	private List<Dish> cookingDishs;
	Date currentDate = new Date();
	
	public CookedOrderEventDataRow(String tabletName, String cookName, int cookingTimeSeconds,
			List<Dish> cookingDishs) {
		this.tabletName = tabletName;
		this.cookName = cookName;
		this.cookingTimeSeconds = cookingTimeSeconds;
		this.cookingDishs = cookingDishs;
	}

	@Override
	public EventType getType() {
		return EventType.COOKED_ORDER;
	}
}
