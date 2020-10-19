package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.CinemaCitizenIdentify;

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
	protected void checkIdentify() {
	}
}
