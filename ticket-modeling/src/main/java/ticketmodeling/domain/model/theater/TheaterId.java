package ticketmodeling.domain.model.theater;

import reivosar.common.util.model.Identity;

public class TheaterId extends Identity<TheaterId>
{
	final String value;

	public TheaterId(final String value) {
		this.value = value;
	}
}
