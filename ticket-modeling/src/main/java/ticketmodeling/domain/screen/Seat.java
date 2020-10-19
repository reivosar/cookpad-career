package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class Seat extends ValueObject<Seat>
{
	final SeatId id;
	final SeatProfile profile;
	final ScreenId screenId;

	public Seat(
		SeatId id,
		SeatProfile profile,
		ScreenId screenId)
	{
		this.id       = id;
		this.profile  = profile;
		this.screenId = screenId;
	}
}
