package ticketmodeling.domain.screen;

import ticketmodeling.common.domain.shared.ValueObject;

public class ScreenName extends ValueObject<ScreenName>
{
	final String value;

	public ScreenName(String value) {
		this.value = value;
	}
}
