package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class SeatProfile extends ValueObject<SeatProfile>
{
	final SeatName name;

	public SeatProfile(SeatName name) {
		this.name = name;
	}
}
