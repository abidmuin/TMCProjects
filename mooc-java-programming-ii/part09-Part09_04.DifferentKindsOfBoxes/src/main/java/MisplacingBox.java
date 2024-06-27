import java.util.ArrayList;

public class MisplacingBox extends Box {
	private final ArrayList<Item> boxes;

	public MisplacingBox() {
		this.boxes = new ArrayList<>();
	}


	@Override
	public void add(Item item) {
		this.boxes.add(item);
	}

	@Override
	public boolean isInBox(Item item) {
		return false;
	}
}
