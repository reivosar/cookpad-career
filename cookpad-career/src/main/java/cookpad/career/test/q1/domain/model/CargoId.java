package cookpad.career.test.q1.domain.model;

import reivosar.common.domain.model.Identity;

public class CargoId extends Identity<CargoId>
{
	private final String value;

	public CargoId(final String value) {
		this.value = value;
	}

	public String getAsString() {
		return value;
	}
}
