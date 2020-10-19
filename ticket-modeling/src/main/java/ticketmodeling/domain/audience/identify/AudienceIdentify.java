package ticketmodeling.domain.audience.identify;

import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceProfile;

public interface AudienceIdentify {

	public AudienceId getId();

	public AudienceProfile getProfile();
}
