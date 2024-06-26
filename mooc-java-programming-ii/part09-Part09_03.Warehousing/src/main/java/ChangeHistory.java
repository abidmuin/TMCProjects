import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
	private final ArrayList<Double> changeHistory;

	public ChangeHistory() {
		this.changeHistory = new ArrayList<>();
	}

	public void add(double status) {
		this.changeHistory.add(status);
	}

	public void clear() {
		this.changeHistory.clear();
	}

	@Override
	public String toString() {
		return this.changeHistory.toString();
	}

	public double maxValue() {
		if (this.changeHistory.isEmpty()) {
			return 0;
		}

		return Collections.max(this.changeHistory);
	}

	public double minValue() {
		if (this.changeHistory.isEmpty()) {
			return 0;
		}

		return Collections.min(this.changeHistory);
	}

	public double average() {
		if (this.changeHistory.isEmpty()) {
			return 0;
		}

		int elements = this.changeHistory.size();
		Double sum = 0.0;

		for (Double value : this.changeHistory) {
			sum += value;
		}

		return sum / elements;
	}
}
