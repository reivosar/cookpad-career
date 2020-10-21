package ticketmodeling.domain.audience;

import java.util.UUID;

import ticketmodeling.common.domain.shared.Identity;

public class AudienceId extends Identity<AudienceId>
{
	final String value;

	public AudienceId(String value) {
		this.value = value;
	}

	public static AudienceId genereteId() {
		return new AudienceId(UUID.randomUUID().toString());
	}
}
