package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.JuniorHandicappedIdentify;

public class JuniorHandicappedAudience extends IdentifiedAudience<JuniorHandicappedAudience>
{
	final JuniorHandicappedIdentify identify;

	public JuniorHandicappedAudience(JuniorHandicappedIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.JUNIOR_HANDICAPPED;
	}

	@Override
	protected void checkIdentify() {
	}
}
