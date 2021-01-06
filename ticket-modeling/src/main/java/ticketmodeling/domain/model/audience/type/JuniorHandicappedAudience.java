package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.JuniorHandicappedIdentify;

public class JuniorHandicappedAudience extends IdentifiedAudience<JuniorHandicappedIdentify,JuniorHandicappedAudience>
{
	final JuniorHandicappedIdentify identify;

	public JuniorHandicappedAudience(final JuniorHandicappedIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.JUNIOR_HANDICAPPED;
	}
}
