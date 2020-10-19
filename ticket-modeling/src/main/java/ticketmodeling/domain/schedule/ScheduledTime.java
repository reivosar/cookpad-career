package ticketmodeling.domain.schedule;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.common.domain.shared.value.HourMinute;

public class ScheduledTime extends ValueObject<ScheduledTime>
{
	final HourMinute hourMinute;

	public ScheduledTime(HourMinute hourMinute) {
		this.hourMinute = hourMinute;
	}
}
