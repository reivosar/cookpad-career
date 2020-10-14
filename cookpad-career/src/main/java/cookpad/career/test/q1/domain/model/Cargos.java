package cookpad.career.test.q1.domain.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cargos
{
	private final Collection<Cargo> cargos;

	public static Cargos empty() {
		return new Cargos(new ArrayList<Cargo>());
	}

	public Cargos(final Collection<Cargo> cargos) {
		this.cargos = cargos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cargos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargos other = (Cargos) obj;
		return Objects.equals(cargos, other.cargos);
	}

	public CargoWeight totalWeight() {
		final CargoWeight result = new CargoWeight(0);
		return result.sum(stream ()
                    .map     (luggage -> luggage.weight())
                    .collect (Collectors.toList())
                    .toArray (new CargoWeight[0]));
	}

	public Collection<Cargo> allCargos() {
		return cargos;
	}

	public Collection<String> ids() {
		return stream()
				.map     (luggage -> luggage.id().toString())
				.collect (Collectors.toList());
	}

	public void load(final Cargo cargo) {
		cargos.add(cargo);
	}

	private Stream<Cargo> stream() {
		return cargos.stream();
	}
}
