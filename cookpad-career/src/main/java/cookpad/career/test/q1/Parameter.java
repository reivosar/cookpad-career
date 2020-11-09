package cookpad.career.test.q1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cookpad.career.test.q1.domain.model.Cargo;
import cookpad.career.test.q1.domain.model.CargoId;
import cookpad.career.test.q1.domain.model.CargoWeight;
import cookpad.career.test.q1.domain.model.Cargos;
import cookpad.career.test.q1.domain.model.Trucks;

public class Parameter
{
	private final Trucks trucks;
	private final Cargos cargos;

	public Parameter(final int loadTrucksNumber, final String... params) {
		this.trucks = new Trucks(loadTrucksNumber);
		this.cargos = new Cargos (
			Arrays.asList(params).stream()
				.map     (param -> param.split(":"))
				.filter  (param -> param.length == 2)
				.flatMap (param -> Stream.of(toCargo(param)))
				.collect (Collectors.toList())
		);
	}

	public Trucks toTrucks() {
		return trucks;
	}

	public Cargos toCargos() {
		return cargos;
	}

	private Cargo toCargo(final String[] param) {
		return new Cargo (
			new CargoId     (param[0].trim()),
			new CargoWeight (Integer.parseInt(param[1].trim()))
		);
	}
}
