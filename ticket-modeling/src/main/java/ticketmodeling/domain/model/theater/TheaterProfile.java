package ticketmodeling.domain.model.theater;

import ticketmodeling.common.domain.model.ValueObject;

public class TheaterProfile extends ValueObject<TheaterProfile>
{
	final TheaterName name;

	public TheaterProfile(TheaterName name) {
		this.name = name;
	}
}
