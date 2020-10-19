package ticketmodeling.domain.plan;

import ticketmodeling.common.domain.shared.Entity;

public class Plan extends Entity<PlanId, Plan>
{
	final PlanId planId;
	final PlanProfile planProfile;
	final Price price;

	public Plan(
		PlanId planId,
		PlanProfile planProfile,
		Price price)
	{
		this.planId      = planId;
		this.planProfile = planProfile;
		this.price       = price;
	}
}
