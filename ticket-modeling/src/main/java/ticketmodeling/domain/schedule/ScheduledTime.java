package ticketmodeling.domain.schedule;

import ticketmodeling.domain.shared.HourMinute;
import ticketmodeling.domain.shared.ValueObject;

public class ScheduledTime extends ValueObject<ScheduledTime>
{
	final HourMinute hourMinute;

	public ScheduledTime(HourMinute hourMinute) {
		this.hourMinute = hourMinute;
	}
}
