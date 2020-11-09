package cookpad.career.test.q1.domain.model;

import java.util.Collection;

import reivosar.common.domain.model.Entity;

public class Truck extends Entity<TruckId, Truck>
{
	private final TruckId truckId;
	private final Cargos cargos;

	public Truck(final TruckId truckId) {
		this.truckId = truckId;
		this.cargos  = Cargos.empty();
	}

	@Override
	public TruckId publicId() {
		return truckId;
	}

	public CargoWeight totalWeight() {
		return cargos.totalWeight();
	}

	public Collection<CargoId> cargoIds() {
		return cargos.cargoIds();
	}

	public void load(final Cargo cargo) {
		this.cargos.load(cargo);
	}

	@Override
	public String toString() {
		return "truck_" + truckId.toString() + ":" + String.join(",", cargos.cargoNativeIds());
	}
}
