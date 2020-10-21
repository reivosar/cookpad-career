package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.ValueObject;

public class SeatName extends ValueObject<SeatName>
{
	final String value;

	public SeatName(String value) {
		this.value = value;
	}
}
