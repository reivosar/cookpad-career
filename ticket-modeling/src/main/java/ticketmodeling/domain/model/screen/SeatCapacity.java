package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.ValueObject;

public class SeatCapacity extends ValueObject<SeatCapacity>
{
	final int value;

	public SeatCapacity(int value) {
		this.value = value;
	}
}
