package ticketmodeling.domain.model.theater;

import java.util.Collection;

import ticketmodeling.common.domain.model.Entity;
import ticketmodeling.domain.model.screen.ScreenId;

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
