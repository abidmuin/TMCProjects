import java.util.ArrayList;

public class Suitcase {
    private final int maxWeight;
    private final ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (!items.contains(item)) {
            if (this.totalWeight() + item.getWeight() <= maxWeight) {
                items.add(item);
            }
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        int heaviestItemWeight = Integer.MIN_VALUE;
        String heaviestItemName = "";
        Item heaviestItem = items.get(0);

        for (Item item : items) {
            if (item.getWeight() > heaviestItemWeight) {
                heaviestItemWeight = item.getWeight();
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }

    @Override
    public String toString() {

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item " + "( " + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items " + "(" + this.totalWeight() + "kg)";
    }
}
