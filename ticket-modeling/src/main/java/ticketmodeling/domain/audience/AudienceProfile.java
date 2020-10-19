package ticketmodeling.domain.audience;

import ticketmodeling.common.domain.shared.ValueObject;

public class AudienceProfile extends ValueObject<AudienceProfile>
{
	final BirthDay birthDay;

	public AudienceProfile(BirthDay birthDay) {
		this.birthDay = birthDay;
	}
}
