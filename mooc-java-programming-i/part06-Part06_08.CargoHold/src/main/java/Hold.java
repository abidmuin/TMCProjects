import java.util.ArrayList;

public class Hold {
	private final int maxWeight;
	private final ArrayList<Suitcase> holds;

	public Hold(int maxWeight) {
		this.maxWeight = maxWeight;
		this.holds = new ArrayList<>();
	}

	public void addSuitcase(Suitcase suitcase) {
		if (this.getTotalWeight() + suitcase.totalWeight() <= maxWeight) {
			this.holds.add(suitcase);
		}
	}

	public int getTotalWeight() {
		int totalWeight = 0;
		for (Suitcase suitcase : this.holds) {
			totalWeight += suitcase.totalWeight();
		}

		return totalWeight;
	}

	public void printItems() {
		for (Suitcase suitcase : this.holds) {
			suitcase.printItems();
		}
	}

	@Override
	public String toString() {
		return this.holds.size() + " suitcases " + "(" + this.getTotalWeight() + " kg)";
	}
}
