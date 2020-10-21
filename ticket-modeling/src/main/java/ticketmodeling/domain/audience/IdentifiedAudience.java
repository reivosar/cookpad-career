package ticketmodeling.domain.audience;

import ticketmodeling.domain.audience.identify.AudienceIdentify;

public abstract class IdentifiedAudience<ENTITY extends IdentifiedAudience<ENTITY>> extends Audience<ENTITY>
{
	public IdentifiedAudience(AudienceIdentify identify) {
		super(identify.getId());
		verify();
	}

	protected abstract void verify();
}
