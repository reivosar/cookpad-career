package cookpad.career.test.q1.domain.model;

import reivosar.common.util.model.Entity;

public class Cargo extends Entity<CargoId, Cargo>
{
	private final CargoId id;
	private final CargoWeight weight;

	public Cargo(final CargoId id, final CargoWeight weight) {
		this.id     = id;
		this.weight = weight;
	}

	@Override
	public CargoId publicId() {
		return id;
	}

	public CargoWeight weight() {
		return weight;
	}
}
