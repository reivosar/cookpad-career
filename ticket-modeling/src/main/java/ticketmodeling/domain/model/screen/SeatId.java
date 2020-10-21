package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.Identity;

public class SeatId extends Identity<SeatId>
{
	final String value;

	public SeatId(String value) {
		this.value = value;
	}
}
