package ticketmodeling.domain.audience.identify;

import ticketmodeling.common.domain.shared.ValueObject;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;
import ticketmodeling.domain.audience.BirthDay;

public class ChildIdentify extends ValueObject<ChildIdentify>
	implements AudienceIdentify
{
	final BirthDay birthDay;

	private ChildIdentify(BirthDay birthDay) {
		this.birthDay = birthDay;
	}

	public AudienceId getId() {
		return AudienceId.genereteId();
	}

	public AudienceProfile getProfile() {
		return new AudienceProfile(birthDay);
	}

	@Override
	public void verify() {
		if (birthDay.isOverAge(12)) {
			throw new AudienceIdentifyException("It's no older than grade school.");
		}
	}
}
