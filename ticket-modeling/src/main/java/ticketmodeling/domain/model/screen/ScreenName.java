package ticketmodeling.domain.model.screen;

import reivosar.common.domain.model.ValueObject;

public class ScreenName extends ValueObject<ScreenName>
{
	final String value;

	public ScreenName(String value) {
		this.value = value;
	}
}
