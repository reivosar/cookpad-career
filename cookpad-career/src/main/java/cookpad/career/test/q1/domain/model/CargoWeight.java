package cookpad.career.test.q1.domain.model;

import java.util.Arrays;

import reivosar.common.domain.model.ValueObject;

public class CargoWeight extends ValueObject<CargoWeight>
{
	private final Integer value;

	public CargoWeight(final Integer value) {
		this.value = value;
	}

	public CargoWeight sum(final CargoWeight... others) {
		return new CargoWeight(this.value + Arrays.asList(others)
                                                .stream()
                                                .mapToInt(other -> other.value)
                                                .sum());
	}

	@Override
	public String toString() {
		return value.toString();
	}
}
