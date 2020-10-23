package ticketmodeling.domain.model.theater;

import reivosar.common.domain.model.Identity;

public class TheaterId extends Identity<TheaterId>
{
	final String value;

	public TheaterId(String value) {
		this.value = value;
	}
}
