package cookpad.career.test.q1.domain.model;

import java.util.Objects;

public class Cargo
{
	private final CargoId id;
	private final CargoWeight weight;

	public Cargo(final CargoId id, final CargoWeight weight) {
		this.id     = id;
		this.weight = weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(id, other.id) && Objects.equals(weight, other.weight);
	}

	public CargoId id() {
		return id;
	}

	public CargoWeight weight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", weight=" + weight + "]";
	}
}
