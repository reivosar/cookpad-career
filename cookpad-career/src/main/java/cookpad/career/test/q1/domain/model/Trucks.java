package cookpad.career.test.q1.domain.model;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

import reivosar.common.domain.model.ValueObject;

public class Trucks extends ValueObject<Trucks>
{
	private final Map<TruckId, Truck> truckStore;

	public Trucks(final int loadTrucksNumber) {
		this.truckStore = new HashMap<TruckId, Truck>(loadTrucksNumber);
		IntStream.range(1, loadTrucksNumber + 1)
			.forEach(number -> {
				final TruckId truckId = new TruckId(number);
				this.truckStore.put(truckId, new Truck(truckId));
			}
		);
	}

	private TruckId minimumWeightTruckId() {
		// トラックに荷物を積んだ結果同じサイズになる場合の考慮。
		// 重さが同じだった場合は箱IDの若い順に荷物を積む必要がある。
		// 単純に重さだけでどのトラックに荷物を積むかを判別するのは誤り。
		final TreeMap<String, TreeSet<TruckId>> map = new TreeMap<String, TreeSet<TruckId>>();
		truckStore.forEach((truckId, truck) -> {
			final String key = truck.totalWeight().toString();
			final TreeSet<TruckId> truckIdList = map.getOrDefault(key,
					new TreeSet<TruckId>(Comparator.comparing(TruckId::toString)));
			truckIdList.add(truckId);
			map.put(key, truckIdList);
		});
		return map.firstEntry().getValue().first();
	}

	public void load(final Cargos cargos) {
		for (Cargo cargo : cargos.allCargos()) {
			final TruckId truckId = minimumWeightTruckId();
			final Truck truck     = truckStore.get(truckId);
			truck.load(cargo);
		};
	}

	public Truck get(TruckId truckId) {
		return truckStore.get(truckId);
	}

	public Collection<Truck> allTrucks() {
		return truckStore.values();
	}
}
