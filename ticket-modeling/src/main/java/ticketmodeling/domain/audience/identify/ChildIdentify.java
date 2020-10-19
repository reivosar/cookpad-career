package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;
import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.BirthDay;

public class ChildIdentify extends ValueObject<ChildIdentify>
	implements AudienceIdentify
{
	final BirthDay birthDay;

	private ChildIdentify(BirthDay birthDay) {
		this.birthDay = birthDay;
	}

	public AudienceId getId() {
		return new AudienceId(AudienceType.CHILD.name());
	}

	public AudienceProfile getProfile() {
		return new AudienceProfile(birthDay);
	}
}
