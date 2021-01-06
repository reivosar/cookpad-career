package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.UniversityIdentify;

public class UniversityAudience extends IdentifiedAudience<UniversityIdentify, UniversityAudience> {

	final UniversityIdentify identify;

	public UniversityAudience(final UniversityIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.UNIVERSITY;
	}
}
