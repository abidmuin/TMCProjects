public class Container {
	private final int containerMaxSize;
	private int containerAmount;

	public Container() {
		this.containerAmount = 0;
		this.containerMaxSize = 100;
	}

	public int contains() {
		return containerAmount;
	}

	public void add(int amount) {
		if (amount > 0) {
			if (containerAmount + amount <= containerMaxSize) {
				containerAmount += amount;
			} else {
				containerAmount = 100;
			}
		}
	}

	public void remove(int amount) {
		if (amount > 0) {
			if (containerAmount - amount >= 0) {
				containerAmount -= amount;
			} else {
				containerAmount = 0;
			}
		}
	}

	@Override
	public String toString() {
		return containerAmount + "/" + containerMaxSize;
	}
}
