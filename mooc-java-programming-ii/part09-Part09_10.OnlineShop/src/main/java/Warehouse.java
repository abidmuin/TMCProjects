import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
	private final Map<String, Integer> stock;
	private final Map<String, Integer> products;

	public Warehouse() {
		this.stock = new HashMap<>();
		this.products = new HashMap<>();
	}

	public void addProduct(String product, int price, int stock) {
		this.products.put(product, price);
		this.stock.put(product, stock);
	}

	public int price(String product) {
		if (this.products.containsKey(product)) {
			return this.products.get(product);
		}

		return -99;
	}

	public int stock(String product) {
		if (this.stock.containsKey(product)) {
			return this.stock.get(product);
		}

		return 0;
	}

	public boolean take(String product) {
		if (this.stock.containsKey(product)) {
			if (this.stock.get(product) > 0) {
				this.stock.put(product, this.stock.get(product) - 1);
				return true;
			}
		}

		return false;
	}

	public Set<String> products() {
		return this.products.keySet();
	}
}
