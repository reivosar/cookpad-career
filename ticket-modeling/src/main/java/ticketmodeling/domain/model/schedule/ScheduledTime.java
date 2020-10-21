package ticketmodeling.domain.model.schedule;

import ticketmodeling.common.domain.model.ValueObject;
import ticketmodeling.common.domain.model.primitive.HourMinute;

public class ScheduledTime extends ValueObject<ScheduledTime>
{
	final HourMinute hourMinute;

	public ScheduledTime(HourMinute hourMinute) {
		this.hourMinute = hourMinute;
	}
}
