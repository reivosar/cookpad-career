package ticketmodeling.domain.audience;

import ticketmodeling.domain.shared.Identity;

public class AudienceId extends Identity<AudienceId>
{
	final String value;

	public AudienceId(String value) {
		this.value = value;
	}
}
