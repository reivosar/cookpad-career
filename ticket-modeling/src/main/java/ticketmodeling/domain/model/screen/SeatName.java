package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.ValueObject;

public class SeatName extends ValueObject<SeatName>
{
	final String value;

	public SeatName(final String value) {
		this.value = value;
	}
}
