package ticketmodeling.domain.model.theater;

import reivosar.common.domain.model.ValueObject;

public class TheaterName extends ValueObject<TheaterName>
{
	final String value;

	public TheaterName(String value) {
		this.value = value;
	}
}
