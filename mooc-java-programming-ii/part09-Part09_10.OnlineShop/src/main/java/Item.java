public class Item {
	private final String product;
	private final int unitPrice;
	private int quantity;

	public Item(String product, int qty, int unitPrice) {
		this.product = product;
		this.quantity = qty;
		this.unitPrice = unitPrice;
	}

	public Item(String product, int unitPrice) {
		this.product = product;
		this.unitPrice = unitPrice;
		this.quantity = 1;
	}

	public int price() {
		return quantity * unitPrice;
	}

	public void increaseQuantity() {
		this.quantity++;

	}

	@Override
	public String toString() {
		return product + ": " + quantity;
	}
}
