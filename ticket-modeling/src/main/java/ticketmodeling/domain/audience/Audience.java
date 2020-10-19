package ticketmodeling.domain.audience;

import ticketmodeling.common.domain.shared.Entity;

public abstract class Audience<ENTITY extends Audience<ENTITY>>
	extends Entity<AudienceId, ENTITY>
{
	final AudienceId id;
	final AudienceProfile profile;

	public Audience(AudienceId id, AudienceProfile profile) {
		this.id = id;
		this.profile = profile;
	}

	public abstract AudienceType type();
}
