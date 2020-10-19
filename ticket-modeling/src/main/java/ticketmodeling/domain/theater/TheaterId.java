package ticketmodeling.domain.theater;

import ticketmodeling.common.domain.shared.Identity;

public class TheaterId extends Identity<TheaterId>
{
	final String value;

	public TheaterId(String value) {
		this.value = value;
	}
}
