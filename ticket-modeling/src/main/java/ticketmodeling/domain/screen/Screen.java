package ticketmodeling.domain.screen;

import java.util.Collection;

import ticketmodeling.domain.schedule.ScheduleId;
import ticketmodeling.domain.shared.Entity;

public class Screen extends Entity<ScreenId, Screen>
{
	final ScreenId screenId;
	final ScreenProfile screenProfile;
	final Collection<ScheduleId> schedules;

	public Screen(
		ScreenId screenId,
		ScreenProfile screenProfile,
		Collection<ScheduleId> schedules)
	{
		this.screenId      = screenId;
		this.screenProfile = screenProfile;
		this.schedules     = schedules;
	}
}
