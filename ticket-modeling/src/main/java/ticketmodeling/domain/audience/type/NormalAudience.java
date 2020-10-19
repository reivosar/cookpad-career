package ticketmodeling.domain.audience.type;

import ticketmodeling.domain.audience.Audience;
import ticketmodeling.domain.audience.AudienceId;
import ticketmodeling.domain.audience.AudienceType;

public class NormalAudience extends Audience<NormalAudience>
{
	public NormalAudience() {
		super(new AudienceId(AudienceType.NORMAL.name()), null);
	}

	@Override
	public AudienceType type() {
		return AudienceType.NORMAL;
	}
}
