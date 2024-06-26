public class ProductWarehouseWithHistory extends ProductWarehouse {
	private final ChangeHistory history;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		this.history = new ChangeHistory();
		this.history.add(initialBalance);
		addToWarehouse(initialBalance);
	}

	public String history() {
		return this.history.toString();
	}

	@Override
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		this.history.add(getBalance());
	}

	@Override
	public double takeFromWarehouse(double amount) {
		if (amount > getBalance()) {
			amount = getBalance();
		}

		double taken = super.takeFromWarehouse(amount);
		this.history.add(getBalance());
		return taken;
	}

	public void printAnalysis() {
		System.out.println("Product: " + super.getName());
		System.out.println("History: " + history());
		System.out.println("Largest amount of product: " + this.history.maxValue());
		System.out.println("Smallest amount of product: " + this.history.minValue());
		System.out.println("Average: " + this.history.average());
	}
}
