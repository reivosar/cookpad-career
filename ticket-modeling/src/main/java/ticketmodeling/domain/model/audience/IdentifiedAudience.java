package ticketmodeling.domain.model.audience;

import ticketmodeling.domain.model.audience.identify.AudienceIdentify;

public abstract class IdentifiedAudience<I extends AudienceIdentify, ENTITY extends IdentifiedAudience<I, ENTITY>>
		extends Audience<ENTITY> {

	public IdentifiedAudience(I identify) {
		super(identify.getId());
		verify(identify);
	}

	protected void verify(I identify) {
		identify.verify();
	}
}
