package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.AudienceType;
import ticketmodeling.domain.audience.IdentifiedAudience;
import ticketmodeling.domain.audience.identify.ChildIdentify;

public class ChildAudience extends IdentifiedAudience<ChildAudience>
{
	final ChildIdentify identify;

	public ChildAudience(ChildIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.CHILD;
	}

	@Override
	protected void verify() {
	}
}
