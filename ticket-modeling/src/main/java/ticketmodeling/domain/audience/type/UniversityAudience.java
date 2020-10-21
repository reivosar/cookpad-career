package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.UniversityIdentify;

public class UniversityAudience extends IdentifiedAudience<UniversityAudience> {

	final UniversityIdentify identify;

	public UniversityAudience(UniversityIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.UNIVERSITY;
	}

	@Override
	protected void verify() {
	}
}
