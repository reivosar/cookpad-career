package ticketmodeling.domain.model.audience.identify;

import ticketmodeling.domain.model.audience.AudienceId;

public interface AudienceIdentify
{
	public void verify();

	public AudienceId getId();
}
