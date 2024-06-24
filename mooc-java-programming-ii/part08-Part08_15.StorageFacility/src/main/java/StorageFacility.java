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
}
