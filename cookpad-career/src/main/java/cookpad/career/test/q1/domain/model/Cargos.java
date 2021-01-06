package cookpad.career.test.q1.domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import reivosar.common.domain.model.ValueObject;

public class Cargos extends ValueObject<Cargos>
{
	private final Collection<Cargo> cargos;

	public static Cargos empty() {
		return new Cargos(new ArrayList<Cargo>());
	}

	public Cargos(final Collection<Cargo> cargos) {
		this.cargos = cargos;
	}

	public CargoWeight totalWeight() {
		final CargoWeight result = new CargoWeight(0);
		return result.sum(stream ()
                    .map     (cargo -> cargo.weight())
                    .collect (Collectors.toList())
                    .toArray (new CargoWeight[0]));
	}

	public Collection<Cargo> allCargos() {
		return Collections.unmodifiableCollection(cargos);
	}

	public Collection<CargoId> cargoIds() {
		return stream()
				.map     (cargo -> cargo.publicId())
				.collect (Collectors.toUnmodifiableList());
	}

	public Collection<String> cargoNativeIds() {
		return stream()
				.map     (cargo -> cargo.publicId().getAsString())
				.collect (Collectors.toUnmodifiableList());
	}

	public void load(final Cargo cargo) {
		cargos.add(cargo);
	}

	private Stream<Cargo> stream() {
		return allCargos().stream();
	}
}
