public class Main {

	public static void main(String[] args) {
		ProductWarehouseWithHistory pwh = new ProductWarehouseWithHistory("coffee", 10, 2);
		pwh.addToWarehouse(4);
		pwh.takeFromWarehouse(2);
		pwh.printAnalysis();
	}
}