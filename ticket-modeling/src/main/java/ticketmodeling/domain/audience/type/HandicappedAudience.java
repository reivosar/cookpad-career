package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.HandicappedIdentify;

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
	protected void checkIdentify() {
	}
}
