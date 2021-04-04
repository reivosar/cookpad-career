package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.Identity;

public class ScreenId extends Identity<ScreenId>
{
	final String value;

	public ScreenId(final String value) {
		this.value = value;
	}
}
