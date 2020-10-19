package ticketmodeling.domain.audience;

import ticketmodeling.domain.audience.identify.AudienceIdentify;

public abstract class IdentifiedAudience<ENTITY extends IdentifiedAudience<ENTITY>> extends Audience<ENTITY>
{
	public IdentifiedAudience(AudienceIdentify identify) {
		super(identify.getId(), identify.getProfile());
		checkIdentify();
	}

	protected abstract void checkIdentify();
}
