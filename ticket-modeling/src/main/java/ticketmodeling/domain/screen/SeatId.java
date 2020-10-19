package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.Identity;

public class SeatId extends Identity<SeatId>
{
	final String value;

	public SeatId(String value) {
		this.value = value;
	}
}
