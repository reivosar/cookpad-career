package cookpad.career.test.q1;

import cookpad.career.test.q1.application.TruckService;
import cookpad.career.test.q1.domain.model.Cargos;
import cookpad.career.test.q1.domain.model.Trucks;

public class Solve
{
	private final TruckService truckService;

	public static void main(String[] args) {
		final Solve solve = new Solve (new TruckService());
		solve.execute (new Parameter (3, args));
	}

	public Solve(final TruckService truckService) {
		this.truckService = truckService;
	}

	public void execute(final Parameter parameter) {
		final Trucks trucks = parameter.toTrucks();
		final Cargos cargos = parameter.toCargos();
		truckService.loadCargosIntoTrucks (trucks, cargos);
		truckService.printScreen          (trucks);
	}
}

