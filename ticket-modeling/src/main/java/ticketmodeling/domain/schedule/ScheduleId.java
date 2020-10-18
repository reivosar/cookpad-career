package ticketmodeling.domain.schedule;

import ticketmodeling.domain.shared.Identity;

public class ScheduleId extends Identity<ScheduleId>
{
	final String value;

	public ScheduleId(String value) {
		this.value = value;
	}
}
