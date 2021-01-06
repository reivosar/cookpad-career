package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.StudentIdentify;

public class StudentAudience extends IdentifiedAudience<StudentIdentify, StudentAudience> {

	final StudentIdentify identify;

	public StudentAudience(final StudentIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.STUDENT;
	}
}
