package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.Audience;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceType;

public class NormalAudience extends Audience<NormalAudience>
{
	public NormalAudience() {
		super(AudienceId.genereteId());
	}

	@Override
	public AudienceType type() {
		return AudienceType.NORMAL;
	}
}
