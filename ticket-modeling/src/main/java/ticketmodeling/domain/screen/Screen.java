package ticketmodeling.domain.screen;

import java.util.Collection;

import ticketmodeling.common.domain.shared.Entity;
import ticketmodeling.domain.schedule.ScheduleId;

public class Screen extends Entity<ScreenId, Screen>
{
	final ScreenId screenId;
	final ScreenProfile screenProfile;
	final Seats seats;
	final Collection<ScheduleId> schedules;

	public Screen(
		ScreenId screenId,
		ScreenProfile screenProfile,
		Seats seats,
		Collection<ScheduleId> schedules)
	{
		this.screenId      = screenId;
		this.screenProfile = screenProfile;
		this.seats         = seats;
		this.schedules     = schedules;
	}
}
