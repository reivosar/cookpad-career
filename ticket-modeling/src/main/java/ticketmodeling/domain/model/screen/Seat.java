package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.ValueObject;
import ticketmodeling.domain.model.schedule.ScheduleId;

public class Seat extends ValueObject<Seat>
{
	final SeatId seatId;
	final SeatProfile profile;
	final SeatReservation reservation;
	final ScreenId screenId;

	public Seat(
		SeatId seatId,
		SeatProfile profile,
		SeatReservation reservation,
		ScreenId screenId)
	{
		this.seatId      = seatId;
		this.profile     = profile;
		this.reservation = reservation;
		this.screenId    = screenId;
	}

	public boolean reservedSeat() {
		return this.reservation.reserved();
	}

	public boolean emptySeat() {
		return this.reservation.noReservation();
	}

	public ScheduleId scheduleId () {
		return this.reservation.scheduleId;
	}
}
