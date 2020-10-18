package ticketmodeling.domain.audience;

import ticketmodeling.domain.shared.ValueObject;

public class AudienceProfile extends ValueObject<AudienceProfile>
{
	final BirthDay birthDay;

	public AudienceProfile(BirthDay birthDay) {
		this.birthDay = birthDay;
	}
}
