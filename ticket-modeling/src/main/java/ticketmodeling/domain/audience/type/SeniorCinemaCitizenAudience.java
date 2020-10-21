package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.SeniorCinemaCitizenIdentify;

public class SeniorCinemaCitizenAudience extends IdentifiedAudience<SeniorCinemaCitizenAudience>
{
	final SeniorCinemaCitizenIdentify identify;

	public SeniorCinemaCitizenAudience(SeniorCinemaCitizenIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.SENIOR_CINEMA_CITIZEN;
	}

	@Override
	protected void verify() {
	}
}
