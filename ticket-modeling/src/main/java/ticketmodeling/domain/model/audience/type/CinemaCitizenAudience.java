package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.CinemaCitizenIdentify;

public class CinemaCitizenAudience extends IdentifiedAudience<CinemaCitizenAudience>
{
	final CinemaCitizenIdentify identify;

	public CinemaCitizenAudience(CinemaCitizenIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.CINEMA_CITIZEN;
	}

	@Override
	protected void verify() {
	}
}
