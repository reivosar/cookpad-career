package ticketmodeling.domain.plan;

import ticketmodeling.domain.shared.ValueObject;

public class PlanName extends ValueObject<PlanName>
{
	final String value;

	public PlanName(String value) {
		this.value = value;
	}
}
