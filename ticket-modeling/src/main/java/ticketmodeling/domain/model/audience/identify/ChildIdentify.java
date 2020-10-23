package ticketmodeling.domain.model.audience.identify;

import reivosar.common.domain.model.ValueObject;
import ticketmodeling.domain.model.audience.AudienceId;
import ticketmodeling.domain.model.audience.BirthDay;

public class ChildIdentify extends ValueObject<ChildIdentify>
	implements AudienceIdentify
{
	final BirthDay birthDay;

	private ChildIdentify(BirthDay birthDay) {
		this.birthDay = birthDay;
	}

	public AudienceId getId() {
		return AudienceId.genereteId();
	}

	@Override
	public void verify() {
		if (birthDay.isOverAge(12)) {
			throw new AudienceIdentifyException("It's no older than grade school.");
		}
	}
}
