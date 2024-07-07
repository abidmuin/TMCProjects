import java.util.ArrayList;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {
	private final ArrayList<Card> cards;

	public Hand() {
		this.cards = new ArrayList<>();
	}

	public void add(Card card) {
		cards.add(card);
	}

	public void print() {
		for (Card card : cards) {
			System.out.println(card);
		}
	}

	public void sort() {
		cards.sort(Comparator.comparing(Card::getValue).thenComparing(Card::getSuit));
	}

	private int calculateTotalValue() {
		int totalValue = 0;

		for (Card card : cards) {
			totalValue += card.getValue();
		}

		return totalValue;
	}

	@Override
	public int compareTo(Hand other) {
		int thisHandValue = calculateTotalValue();
		int otherHandValue = other.calculateTotalValue();

		return Integer.compare(thisHandValue, otherHandValue);
	}

	public void sortBySuit() {
		cards.sort(Comparator.comparing(Card::getSuit));
	}
}