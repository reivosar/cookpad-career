package ticketmodeling.domain.theater;

import ticketmodeling.common.domain.shared.ValueObject;

public class TheaterName extends ValueObject<TheaterName>
{
	final String value;

	public TheaterName(String value) {
		this.value = value;
	}
}
