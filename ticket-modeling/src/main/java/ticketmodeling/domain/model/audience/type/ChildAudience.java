package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.AudienceType;
import ticketmodeling.domain.model.audience.IdentifiedAudience;
import ticketmodeling.domain.model.audience.identify.ChildIdentify;

public class ChildAudience extends IdentifiedAudience<ChildIdentify, ChildAudience>
{
	final ChildIdentify identify;

	public ChildAudience(final ChildIdentify identify) {
		super(identify);
		this.identify = identify;
	}

	@Override
	public AudienceType type() {
		return AudienceType.CHILD;
	}
}
