import java.util.Objects;

public class Item {

	private final String name;
	private final int weight;

	public Item(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public Item(String name) {
		this(name, 0);
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object == null || getClass() != object.getClass()) return false;
		Item item = (Item) object;
		return Objects.equals(getName(), item.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName());
	}
}
