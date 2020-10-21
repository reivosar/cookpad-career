package ticketmodeling.domain.audience.identify;

import ticketmodeling.domain.audience.AudienceId;

public interface AudienceIdentify
{
	public void verify();

	public AudienceId getId();
}
