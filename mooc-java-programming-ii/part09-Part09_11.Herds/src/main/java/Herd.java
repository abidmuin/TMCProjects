import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
	private final List<Movable> herd;

	public Herd() {
		this.herd = new ArrayList<>();
	}

	public void addToHerd(Movable movable) {
		this.herd.add(movable);
	}

	public void move(int dx, int dy) {
		for (Movable movable : this.herd) {
			movable.move(dx, dy);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Movable item : herd) {
			sb.append(item).append("\n");
		}

		return sb.toString().trim();
	}
}
