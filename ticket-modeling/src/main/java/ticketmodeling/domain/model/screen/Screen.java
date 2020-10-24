package ticketmodeling.domain.model.screen;

import java.util.Collection;

import reivosar.common.domain.model.Entity;
import ticketmodeling.domain.model.schedule.ScheduleId;
import ticketmodeling.domain.model.theater.TheaterId;

public class Screen extends Entity<ScreenId, Screen>
{
	final ScreenId screenId;
	final ScreenProfile screenProfile;
	final Seats seats;
	final TheaterId theaterId;

	public Screen(
		ScreenId screenId,
		ScreenProfile screenProfile,
		Seats seats,
		TheaterId theaterId)
	{
		this.screenId      = screenId;
		this.screenProfile = screenProfile;
		this.seats         = seats;
		this.theaterId     = theaterId;
	}

	public Collection<ScheduleId> allSchedules() {
		return this.seats.allSchedules();
	}

	public boolean reservationPossible(ScheduleId scheduleId) {
		return this.seats.reservationPossible(scheduleId);
	}

	public Collection<Seat> allScheduledSeats(ScheduleId scheduleId) {
		return this.seats.allScheduledSeats(scheduleId);
	}

	public Collection<Seat> reserveScheduledSeats(ScheduleId scheduleId) {
		return this.seats.reserveScheduledSeats(scheduleId);
	}

	public Collection<Seat> emptyScheduledSeats(ScheduleId scheduleId) {
		return this.seats.emptyScheduledSeats(scheduleId);
	}

	@Override
	public ScreenId publicId() {
		return screenId;
	}
}
