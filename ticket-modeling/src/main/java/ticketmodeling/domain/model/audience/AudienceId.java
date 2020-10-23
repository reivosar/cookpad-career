package ticketmodeling.domain.model.audience;

import java.util.UUID;

import reivosar.common.domain.model.Identity;

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
