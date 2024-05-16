import java.util.ArrayList;

public class Suitcase {
	private final int maxWeight;
	private final ArrayList<Item> items;

	public Suitcase(int maxWeight) {
		this.maxWeight = maxWeight;
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return this.items + " items " + "(" + this.maxWeight + ")";
	}
}
