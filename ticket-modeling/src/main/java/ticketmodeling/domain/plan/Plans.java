package ticketmodeling.domain.plan;

import java.util.Collection;

import ticketmodeling.domain.shared.ValueObject;

public class Plans extends ValueObject<Plans>
{
	final Collection<Plan> plans;

	public Plans(Collection<Plan> plans) {
		this.plans = plans;
	}
}
