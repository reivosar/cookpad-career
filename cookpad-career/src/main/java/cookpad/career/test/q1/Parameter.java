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
	private final int loadTrucksNumber;
	private final Cargos cargos;

	public Parameter(final int loadTrucksNumber, final String[] params) {
		this.loadTrucksNumber = loadTrucksNumber;
		this.cargos = new Cargos (
			Arrays.asList(params).stream()
				.map     (param -> param.split(":"))
				.flatMap (param -> Stream.of(toLuggage(param)))
				.collect (Collectors.toList())
		);
	}

	public Trucks toTrucks() {
		return new Trucks(loadTrucksNumber);
	}

	public Cargos toCargos() {
		return cargos;
	}

	private Cargo toLuggage(final String[] param) {
		return new Cargo (
			new CargoId     (param[0].trim()),
			new CargoWeight (Integer.parseInt(param[1].trim()))
		);
	}
}
