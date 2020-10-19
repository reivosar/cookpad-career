package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;
import ticketmodeling.domain.audience.AudienceType;

public class UniversityIdentify extends ValueObject<UniversityIdentify>
	implements AudienceIdentify
{
	public AudienceId getId() {
		return new AudienceId(AudienceType.UNIVERSITY.name());
	}

	public AudienceProfile getProfile() {
		return null;
	}
}
