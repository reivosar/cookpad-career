package ticketmodeling.domain.model.audience;

import ticketmodeling.common.domain.model.ValueObject;

public class AudienceProfile extends ValueObject<AudienceProfile>
{
	public static AudienceProfile NONE = new AudienceProfile(BirthDay.NONE);

	final BirthDay birthDay;

	public AudienceProfile(BirthDay birthDay) {
		this.birthDay = birthDay;
	}
}
