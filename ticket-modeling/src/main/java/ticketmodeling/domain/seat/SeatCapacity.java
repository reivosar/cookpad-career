package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class SeatCapacity extends ValueObject<SeatCapacity>
{
	final int value;

	public SeatCapacity(int value) {
		this.value = value;
	}
}
