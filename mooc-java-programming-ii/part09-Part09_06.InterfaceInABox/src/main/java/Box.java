import java.util.ArrayList;

public class Box implements Packable {
	private final double boxCapacity;
	private final ArrayList<Packable> packables;
	private int boxElements;
	private double totalWeight;


	public Box(double boxCapacity) {
		this.boxCapacity = boxCapacity;
		this.boxElements = 0;
		this.totalWeight = 0;
		this.packables = new ArrayList<>();
	}

	@Override
	public double weight() {
		double bookWeight = 0;
		double cdWeight = 0;

		for (Packable packable : packables) {
			bookWeight += packable.weight();
		}

		totalWeight = bookWeight + cdWeight;

		return totalWeight;
	}

	public void add(Packable packable) {
		if (packable.weight() + totalWeight <= boxCapacity) {
			packables.add(packable);
			boxElements++;
		}
	}

	@Override
	public String toString() {
		return "Box: " + this.boxElements + " items, " + "total weight " + this.weight() + " kg";
	}
}
