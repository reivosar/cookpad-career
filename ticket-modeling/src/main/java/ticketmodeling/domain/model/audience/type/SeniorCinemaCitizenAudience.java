package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.SeniorCinemaCitizenIdentify;

public class SeniorCinemaCitizenAudience extends IdentifiedAudience<SeniorCinemaCitizenIdentify, SeniorCinemaCitizenAudience>
{
	final SeniorCinemaCitizenIdentify identify;

	public SeniorCinemaCitizenAudience(final SeniorCinemaCitizenIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.SENIOR_CINEMA_CITIZEN;
	}
}
