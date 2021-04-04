package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.ValueObject;

public class SeatProfile extends ValueObject<SeatProfile>
{
	final SeatName name;

	public SeatProfile(final SeatName name) {
		this.name = name;
	}
}
