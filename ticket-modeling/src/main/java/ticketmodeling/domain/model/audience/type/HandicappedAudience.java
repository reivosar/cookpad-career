package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.HandicappedIdentify;

public class HandicappedAudience extends IdentifiedAudience<HandicappedAudience>
{
	final HandicappedIdentify identify;

	public HandicappedAudience(HandicappedIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.HANDICAPPED;
	}

	@Override
	protected void verify() {
	}
}
