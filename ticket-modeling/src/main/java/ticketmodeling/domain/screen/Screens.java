package ticketmodeling.domain.screen;

import java.util.Collection;

import ticketmodeling.domain.shared.ValueObject;

public class Screens extends ValueObject<Screens>
{
	final Collection<Screen> screen;

	public Screens(Collection<Screen> schedules) {
		this.screen = schedules;
	}
}
