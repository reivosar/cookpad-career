package ticketmodeling.domain.audience;

import ticketmodeling.domain.shared.Entity;

public class Audience extends Entity<AudienceId, Audience>
{
	final AudienceId id;
	final AudienceProfile profile;

	public Audience(
		AudienceId id,
		AudienceProfile profile)
	{
		this.id      = id;
		this.profile = profile;
	}
}
