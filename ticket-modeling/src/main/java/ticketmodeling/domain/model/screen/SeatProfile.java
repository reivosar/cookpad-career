package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.ValueObject;

public class SeatProfile extends ValueObject<SeatProfile>
{
	final SeatName name;

	public SeatProfile(SeatName name) {
		this.name = name;
	}
}
