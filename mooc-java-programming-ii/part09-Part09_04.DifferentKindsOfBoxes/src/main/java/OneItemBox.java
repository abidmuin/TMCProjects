import java.util.ArrayList;

public class OneItemBox extends Box {
	private final ArrayList<Item> items;

	public OneItemBox() {
		this.items = new ArrayList<>();
	}

	public void add(Item item) {
		if (items.isEmpty()) {
			items.add(item);
		}
	}

	public boolean isInBox(Item item) {
		if (items.isEmpty()) {
			return false;
		}
		return items.contains(item);
	}
}
