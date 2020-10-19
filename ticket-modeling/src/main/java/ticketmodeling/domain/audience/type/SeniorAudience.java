package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.SeniorIdentify;

public class SeniorAudience extends IdentifiedAudience<SeniorAudience>
{
	final SeniorIdentify identity;

	public SeniorAudience(SeniorIdentify identity) {
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
