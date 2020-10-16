package cookpad.career.test.q1.domain.model;

import java.util.Objects;

public class Truck
{
	private final TruckId truckId;
	private final Cargos cargos;

	public Truck(final TruckId truckId) {
		this.truckId = truckId;
		this.cargos  = Cargos.empty();
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargos, truckId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Truck other = (Truck) obj;
		return Objects.equals(cargos, other.cargos) && Objects.equals(truckId, other.truckId);
	}

	public CargoWeight totalWeight() {
		return cargos.totalWeight();
	}

	public void load(final Cargo cargo) {
		this.cargos.load(cargo);
	}

	@Override
	public String toString() {
		return "truck_" + truckId.toString() + ":" + String.join(",", cargos.ids());
	}
}
