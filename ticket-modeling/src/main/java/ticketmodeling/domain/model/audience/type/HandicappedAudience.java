package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.HandicappedIdentify;

public class HandicappedAudience extends IdentifiedAudience<HandicappedIdentify, HandicappedAudience>
{
	final HandicappedIdentify identify;

	public HandicappedAudience(final HandicappedIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.HANDICAPPED;
	}
}
