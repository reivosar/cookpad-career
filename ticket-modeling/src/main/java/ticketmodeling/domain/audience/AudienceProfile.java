package ticketmodeling.domain.audience;

import ticketmodeling.common.domain.shared.ValueObject;

public class AudienceProfile extends ValueObject<AudienceProfile>
{
	public static AudienceProfile NONE = new AudienceProfile(BirthDay.NONE);

	final BirthDay birthDay;

	public AudienceProfile(BirthDay birthDay) {
		this.birthDay = birthDay;
	}
}
