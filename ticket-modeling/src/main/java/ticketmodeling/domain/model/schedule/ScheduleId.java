package ticketmodeling.domain.model.schedule;

import reivosar.common.domain.model.Identity;

public class ScheduleId extends Identity<ScheduleId>
{
	final String value;

	public ScheduleId(String value) {
		this.value = value;
	}
}
