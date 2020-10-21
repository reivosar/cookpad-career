package ticketmodeling.domain.model.audience;

import ticketmodeling.domain.model.audience.identify.AudienceIdentify;

public abstract class IdentifiedAudience<ENTITY extends IdentifiedAudience<ENTITY>> extends Audience<ENTITY>
{
	public IdentifiedAudience(AudienceIdentify identify) {
		super(identify.getId());
		verify();
	}

	protected abstract void verify();
}
