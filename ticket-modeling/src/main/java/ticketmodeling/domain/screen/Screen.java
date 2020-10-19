package ticketmodeling.domain.screen;

import java.util.Collection;

import ticketmodeling.common.domain.shared.Entity;
import ticketmodeling.domain.schedule.ScheduleId;
import ticketmodeling.domain.theater.TheaterId;

public class Screen extends Entity<ScreenId, Screen>
{
	final ScreenId screenId;
	final ScreenProfile screenProfile;
	final TheaterId theaterId;
	final Seats seats;
	final Collection<ScheduleId> schedules;

	public Screen(
		ScreenId screenId,
		ScreenProfile screenProfile,
		TheaterId theaterId,
		Seats seats,
		Collection<ScheduleId> schedules)
	{
		this.screenId      = screenId;
		this.screenProfile = screenProfile;
		this.theaterId     = theaterId;
		this.seats         = seats;
		this.schedules     = schedules;
	}
}
