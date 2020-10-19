package ticketmodeling.domain.theater;

import ticketmodeling.common.domain.shared.ValueObject;

public class TheaterProfile extends ValueObject<TheaterProfile>
{
	final TheaterName name;

	public TheaterProfile(TheaterName name) {
		this.name = name;
	}
}
