package ticketmodeling.domain.model.screen;

import ticketmodeling.common.domain.model.Identity;

public class ScreenId extends Identity<ScreenId>
{
	final String value;

	public ScreenId(String value) {
		this.value = value;
	}
}
