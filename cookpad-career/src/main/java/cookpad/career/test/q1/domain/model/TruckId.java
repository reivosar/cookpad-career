package cookpad.career.test.q1.domain.model;

import reivosar.common.domain.model.Identity;

public class TruckId extends Identity<TruckId>
{
	private final Integer value;

	public TruckId(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
