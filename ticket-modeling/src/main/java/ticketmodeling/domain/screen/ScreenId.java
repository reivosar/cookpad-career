package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.Identity;

public class ScreenId extends Identity<ScreenId>
{
	final String value;

	public ScreenId(String value) {
		this.value = value;
	}
}
