package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.Identity;

public class SeatId extends Identity<SeatId>
{
	final String value;

	public SeatId(final String value) {
		this.value = value;
	}
}
