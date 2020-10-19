package ticketmodeling.domain.screen;

public enum SeatReservation
{
	NO_RESERVATION,
	RESERVED;

	public boolean reserved() {
		return this == RESERVED;
	}

	public boolean notReserved() {
		return !reserved();
	}
}
