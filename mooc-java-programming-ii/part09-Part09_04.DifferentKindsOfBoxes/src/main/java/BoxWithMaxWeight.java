import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
	private final ArrayList<Item> boxes;
	private int capacity;

	public BoxWithMaxWeight(int capacity) {
		this.boxes = new ArrayList<>();
		setCapacity(capacity);
	}

	@Override
	public void add(Item item) {
		int itemWeight = item.getWeight();
		if (itemWeight <= this.capacity) {
			boxes.add(item);
			this.capacity -= itemWeight;
		}
	}

	@Override
	public boolean isInBox(Item item) {
		String itemName = item.getName();

		for (Item box : boxes) {
			if (box.getName().equals(itemName)) {
				return true;
			}
		}

		return false;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
