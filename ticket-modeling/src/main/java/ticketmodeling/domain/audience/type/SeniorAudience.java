package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.PersonalIdentify;

public class SeniorAudience extends IdentifiedAudience<SeniorAudience>
{
	final PersonalIdentify identity;

	public SeniorAudience(PersonalIdentify identity) {
		super(identity);
		this.identity = identity;
	}

	@Override
	public AudienceType type() {
		return AudienceType.SENIOR;
	}

	@Override
	protected void checkIdentify() {
	}
}
