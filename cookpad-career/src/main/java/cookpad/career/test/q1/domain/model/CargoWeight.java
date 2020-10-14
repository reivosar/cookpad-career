package cookpad.career.test.q1.domain.model;

import java.util.Arrays;
import java.util.Objects;

public class CargoWeight
{
	private final Integer value;

	public CargoWeight(final Integer value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CargoWeight other = (CargoWeight) obj;
		return value == other.value;
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
