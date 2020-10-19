package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;
import ticketmodeling.domain.audience.AudienceType;

public class HandicappedIdentify extends ValueObject<HandicappedIdentify>
	implements AudienceIdentify
{
	@Override
	public AudienceId getId() {
		return new AudienceId(AudienceType.HANDICAPPED.name());
	}

	@Override
	public AudienceProfile getProfile() {
		return null;
	}
}
