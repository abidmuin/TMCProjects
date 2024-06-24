import java.util.HashMap;

public class VehicleRegistry {
	private final HashMap<LicensePlate, String> vehicleOwners;

	public VehicleRegistry() {
		this.vehicleOwners = new HashMap<>();
	}

	public boolean add(LicensePlate licensePlate, String owner) {
		if (vehicleOwners.containsKey(licensePlate)) {
			return false;
		} else {
			vehicleOwners.put(licensePlate, owner);
		}

		return true;
	}

	public String get(LicensePlate licensePlate) {
		if (vehicleOwners.containsKey(licensePlate)) {
			return vehicleOwners.get(licensePlate);
		}

		return null;
	}

	public boolean remove(LicensePlate licensePlate) {
		if (vehicleOwners.containsKey(licensePlate)) {
			vehicleOwners.remove(licensePlate);
			return true;
		}

		return false;
	}
}
