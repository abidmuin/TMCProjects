import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
	private final HashMap<String, ArrayList<String>> facility;

	public StorageFacility() {
		this.facility = new HashMap<>();
	}

	public void add(String unit, String item) {
		if (!facility.containsKey(unit)) {
			facility.put(unit, new ArrayList<>());
			facility.get(unit).add(item);
		} else {
			facility.get(unit).add(item);
		}
	}

	public ArrayList<String> contents(String storageUnit) {
		if (facility.containsKey(storageUnit)) {
			return facility.get(storageUnit);
		}

		return new ArrayList<>();
	}

	public void remove(String storageUnit, String item) {
		if (facility.containsKey(storageUnit)) {
			facility.get(storageUnit).remove(item);
		}
	}

	public ArrayList<String> storageUnits() {
		ArrayList<String> storageUnitsWithItems = new ArrayList<>();

		for (String unit : facility.keySet()) {
			if (!facility.get(unit).isEmpty()) {
				storageUnitsWithItems.add(unit);
			}
		}

		return storageUnitsWithItems;
	}

}
