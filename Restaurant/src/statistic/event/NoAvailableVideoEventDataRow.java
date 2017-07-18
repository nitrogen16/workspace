package statistic.event;

import java.util.Date;

public class NoAvailableVideoEventDataRow implements EventDataRow {
	private int totalDuration;
	Date currentDate = new Date();
	
	public NoAvailableVideoEventDataRow(int totalDuration) {
		this.totalDuration = totalDuration;
	}

	@Override
	public EventType getType() {
		return EventType.NO_AVAILABLE_VIDEO;
	}
}
