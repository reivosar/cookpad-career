package ticketmodeling.domain.screen;

public enum SeatReservationType
{
	NO_RESERVATION,
	RESERVED;

	public boolean reserved() {
		return this == RESERVED;
	}

	public boolean noReservation() {
		return !reserved();
	}
}
