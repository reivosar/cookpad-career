package ticketmodeling.domain.model.audience;

import ticketmodeling.domain.model.audience.identify.AudienceIdentify;

public abstract class IdentifiedAudience<I extends AudienceIdentify, ENTITY extends IdentifiedAudience<I, ENTITY>>
		extends Audience<ENTITY> {

	public IdentifiedAudience(final I identify) {
		super(identify.getId());
		verify(identify);
	}

	private void verify(final I identify) {
		identify.verify();
	}
}
