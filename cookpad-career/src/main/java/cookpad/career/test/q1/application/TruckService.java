package cookpad.career.test.q1.application;

import cookpad.career.test.q1.domain.model.Cargos;
import cookpad.career.test.q1.domain.model.Trucks;

public class TruckService
{
	public void loadCargosIntoTrucks(final Trucks trucks, final Cargos cargos) {
		trucks.load (cargos);
	}

	public void printScreen(Trucks trucks) {
		trucks.allTrucks().forEach(truck -> System.out.println(truck));
	}
}
