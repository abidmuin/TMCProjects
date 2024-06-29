import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	private final Map<String, Item> shoppingCart;

	public ShoppingCart() {
		this.shoppingCart = new HashMap<>();
	}

	public void add(String product, int price) {
		if (shoppingCart.containsKey(product)) {
			shoppingCart.get(product).increaseQuantity();
		} else {
			shoppingCart.put(product, new Item(product, price));
		}
	}


	public int price() {
		int cartPrice = 0;

		for (Item item : shoppingCart.values()) {
			cartPrice += item.price();
		}

		return cartPrice;
	}

	public void print() {
		for (Item item : shoppingCart.values()) {
			System.out.println(item.toString());
		}
	}
}
