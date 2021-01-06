package cookpad.career.test.q1.application;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import cookpad.career.test.q1.Parameter;
import cookpad.career.test.q1.domain.model.CargoId;
import cookpad.career.test.q1.domain.model.CargoWeight;
import cookpad.career.test.q1.domain.model.Cargos;
import cookpad.career.test.q1.domain.model.Truck;
import cookpad.career.test.q1.domain.model.TruckId;
import cookpad.career.test.q1.domain.model.Trucks;

class TruckServiceTest {

	private TruckService testClass= new TruckService();

	@Test
	void testLoadCargosIntoTrucks() {
		final Parameter parameter = new Parameter(3, "1:50", "2:30", "3:40" ,"4:10");
		final Trucks trucks = executeTestMethod(parameter);
		assertThat(trucks, is(notNullValue()));

		final Truck truck1 = trucks.get(new TruckId(1));
		assertThat(truck1,               is(notNullValue()));
		assertThat(truck1.totalWeight(), is(new CargoWeight(50)));
		assertThat(truck1.cargoIds(),    is(Arrays.asList(new CargoId("1"))));
		assertThat(truck1.getAsString(), is("truck_1:1"));

		final Truck truck2 = trucks.get(new TruckId(2));
		assertThat(truck2,               is(notNullValue()));
		assertThat(truck2.totalWeight(), is(new CargoWeight(40)));
		assertThat(truck2.cargoIds(),    is(Arrays.asList(new CargoId("2"), new CargoId("4"))));
		assertThat(truck2.getAsString(), is("truck_2:2,4"));

		final Truck truck3 = trucks.get(new TruckId(3));
		assertThat(truck3,               is(notNullValue()));
		assertThat(truck3.totalWeight(), is(new CargoWeight(40)));
		assertThat(truck3.cargoIds(),    is(Arrays.asList(new CargoId("3"))));
		assertThat(truck3.getAsString(), is("truck_3:3"));
	}

	private Trucks executeTestMethod(final Parameter parameter) {
		final Trucks trucks = parameter.toTrucks();
		final Cargos cargos = parameter.toCargos();
		this.testClass.loadCargosIntoTrucks(trucks, cargos);
		return trucks;
	}
}
