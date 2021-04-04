package ticketmodeling.domain.model.screen;

import reivosar.common.util.model.ValueObject;

public class ScreenName extends ValueObject<ScreenName>
{
	final String value;

	public ScreenName(final String value) {
		this.value = value;
	}
}
