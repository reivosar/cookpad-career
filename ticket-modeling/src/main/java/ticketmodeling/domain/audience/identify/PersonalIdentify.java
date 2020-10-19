package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;

public class PersonalIdentify extends ValueObject<PersonalIdentify>
	implements AudienceIdentify
{
	@Override
	public AudienceId getId() {
		return null;
	}

	@Override
	public AudienceProfile getProfile() {
		return null;
	}
}