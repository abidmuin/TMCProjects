public class Container {
	private final int containerCapacity;
	private int containerSize;

	public Container() {
		this.containerSize = 0;
		this.containerCapacity = 100;
	}

	public int contains() {
		return this.containerSize;
	}

	public void add(int amount) {
		if (amount > 0) {
			if ((this.containerSize + amount) <= this.containerCapacity) {
				this.containerSize += amount;
			} else {
				this.containerSize = this.containerCapacity;
			}
		}
	}

	public void remove(int amount) {
		if (amount > 0) {
			if ((this.containerSize - amount) >= 0) {
				this.containerSize -= amount;
			} else {
				this.containerSize = 0;
			}
		}
	}

	public String toString() {
		return this.containerSize + "/" + this.containerCapacity;
	}
}
