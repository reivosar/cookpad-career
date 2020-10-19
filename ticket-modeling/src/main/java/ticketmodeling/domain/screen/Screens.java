package ticketmodeling.domain.screen;

import java.util.Collection;

import ticketmodeling.common.domain.shared.ValueObject;

public class Screens extends ValueObject<Screens>
{
	final Collection<Screen> screens;

	public Screens(Collection<Screen> screens) {
		this.screens = screens;
	}
}
