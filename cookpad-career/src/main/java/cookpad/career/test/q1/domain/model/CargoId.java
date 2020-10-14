package cookpad.career.test.q1.domain.model;

import java.util.Objects;

public class CargoId
{
	private final String value;

	public CargoId(final String value) {
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
		CargoId other = (CargoId) obj;
		return Objects.equals(value, other.value);
	}

	@Override
	public String toString() {
		return value;
	}
}
