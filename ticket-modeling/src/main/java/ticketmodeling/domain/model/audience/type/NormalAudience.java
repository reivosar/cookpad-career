package ticketmodeling.domain.model.audience.type;

import ticketmodeling.domain.model.audience.Audience;
import ticketmodeling.domain.model.audience.AudienceId;
import ticketmodeling.domain.model.audience.AudienceType;

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
