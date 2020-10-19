package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;

public class SeniorCinemaCitizenIdentify extends ValueObject<SeniorCinemaCitizenIdentify>
	implements AudienceIdentify
{
	final AudienceId id;
	final AudienceProfile profile;

	public SeniorCinemaCitizenIdentify(AudienceId id, AudienceProfile profile) {
		this.id      = id;
		this.profile = profile;
	}

	public AudienceId getId() {
		return id;
	}

	public AudienceProfile getProfile() {
		return profile;
	}
}
