package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class ScreenProfile extends ValueObject<ScreenProfile>
{
	final ScreenName screenName;

	public ScreenProfile(ScreenName screenName) {
		this.screenName = screenName;
	}
}
