package ticketmodeling.domain.plan;

import ticketmodeling.common.domain.shared.Identity;

public class PlanId extends Identity<PlanId>
{
	final String value;

	public PlanId(String value) {
		this.value = value;
	}
}
