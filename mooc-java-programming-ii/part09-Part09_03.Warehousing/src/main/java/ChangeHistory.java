import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
	private final ArrayList<Double> history;

	public ChangeHistory() {
		this.history = new ArrayList<>();
	}

	public void add(double status) {
		this.history.add(status);
	}

	public void clear() {
		this.history.clear();
	}

	@Override
	public String toString() {
		return this.history.toString();
	}

	public double maxValue() {
		if (this.history.isEmpty()) {
			return 0.0;
		}

		return Collections.max(this.history);
	}

	public double minValue() {
		if (this.history.isEmpty()) {
			return 0.0;
		}

		return Collections.min(this.history);
	}

	public double average() {
		if (this.history.isEmpty()) {
			return 0.0;
		}

		int elements = this.history.size();
		Double sum = 0.0;

		for (Double value : this.history) {
			sum += value;
		}

		return sum / elements;
	}
}
