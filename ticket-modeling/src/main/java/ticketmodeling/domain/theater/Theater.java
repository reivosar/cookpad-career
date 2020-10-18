package ticketmodeling.domain.theater;

import java.util.Collection;

import ticketmodeling.domain.screen.ScreenId;
import ticketmodeling.domain.shared.Entity;

public class Theater extends Entity<TheaterId, Theater>
{
	final TheaterId id;
	final TheaterProfile profile;
	final Collection<ScreenId> screens;

	public Theater(
		TheaterId id,
		TheaterProfile profile,
		Collection<ScreenId> screens)
	{
		this.id      = id;
		this.profile = profile;
		this.screens = screens;
	}

	public Collection<ScreenId> allScreening() {
		return screens;
	}
}
