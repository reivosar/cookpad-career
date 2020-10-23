package ticketmodeling.domain.model.schedule;

import reivosar.common.domain.model.time.HourMinute;
import reivosar.common.domain.model.ValueObject;

public class ScheduledTime extends ValueObject<ScheduledTime>
{
	final HourMinute hourMinute;

	public ScheduledTime(HourMinute hourMinute) {
		this.hourMinute = hourMinute;
	}
}
