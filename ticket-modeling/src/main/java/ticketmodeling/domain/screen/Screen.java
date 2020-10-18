package ticketmodeling.domain.screen;

import ticketmodeling.domain.shared.Entity;

public class Screen extends Entity<ScreenId, Screen>
{
	final ScreenId screenId;
	final ScreenProfile screenProfile;

	public Screen(ScreenId screenId, ScreenProfile screenProfile) {
		this.screenId      = screenId;
		this.screenProfile = screenProfile;
	}
}
