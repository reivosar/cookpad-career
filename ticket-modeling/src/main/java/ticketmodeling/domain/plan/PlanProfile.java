package ticketmodeling.domain.plan;

import ticketmodeling.domain.shared.ValueObject;

public class PlanProfile extends ValueObject<PlanProfile>
{
	final PlanName name;

	public PlanProfile(PlanName name) {
		this.name = name;
	}
}
