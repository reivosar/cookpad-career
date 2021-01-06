package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.SeniorIdentify;

public class SeniorAudience extends IdentifiedAudience<SeniorIdentify, SeniorAudience>
{
	final SeniorIdentify identity;

	public SeniorAudience(final SeniorIdentify identity) {
		super(identity);
		this.identity = identity;
	}

	@Override
	public AudienceType type() {
		return AudienceType.SENIOR;
	}
}
