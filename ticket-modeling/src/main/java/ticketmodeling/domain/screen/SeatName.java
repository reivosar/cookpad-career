package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class SeatName extends ValueObject<SeatName>
{
	final String value;

	public SeatName(String value) {
		this.value = value;
	}
}
