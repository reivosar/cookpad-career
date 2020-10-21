package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.StudentIdentify;

public class StudentAudience extends IdentifiedAudience<StudentAudience> {

	final StudentIdentify identify;

	public StudentAudience(StudentIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.STUDENT;
	}

	@Override
	protected void verify() {
	}
}
