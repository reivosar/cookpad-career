package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class Seat extends ValueObject<Seat>
{
	final SeatId id;
	final SeatProfile profile;
	final SeatReservation reservation;

	public Seat(
		SeatId id,
		SeatProfile profile,
		SeatReservation reservation)
	{
		this.id          = id;
		this.profile     = profile;
		this.reservation = reservation;
	}

	public boolean reserved() {
		return this.reservation.reserved();
	}

	public boolean notReserved() {
		return this.reservation.reserved();
	}
}
