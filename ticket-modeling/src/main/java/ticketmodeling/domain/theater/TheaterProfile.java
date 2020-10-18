package ticketmodeling.domain.theater;

import ticketmodeling.domain.shared.ValueObject;

public class TheaterProfile extends ValueObject<TheaterProfile>
{
	final TheaterName name;

	public TheaterProfile(TheaterName name) {
		this.name = name;
	}
}
