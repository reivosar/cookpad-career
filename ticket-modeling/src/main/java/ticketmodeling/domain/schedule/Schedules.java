package ticketmodeling.domain.schedule;

import java.util.Collection;

import ticketmodeling.common.domain.shared.ValueObject;

public class Schedules extends ValueObject<Schedules>
{
	final Collection<Schedule> schedules;

	public Schedules(Collection<Schedule> schedules) {
		this.schedules = schedules;
	}
}
