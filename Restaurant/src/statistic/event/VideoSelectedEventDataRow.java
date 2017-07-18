package statistic.event;

import java.util.Date;
import java.util.List;

import ad.Advertisement;

public class VideoSelectedEventDataRow implements EventDataRow {
	private List<Advertisement> optimalVideoSet;
	private long amount;
	private int totalDuration;
	Date currentDate = new Date();
	
	public VideoSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
		this.optimalVideoSet = optimalVideoSet;
		this.amount = amount;
		this.totalDuration = totalDuration;
	}

	@Override
	public EventType getType() {
		return EventType.SELECTED_VIDEOS;
	}
}
