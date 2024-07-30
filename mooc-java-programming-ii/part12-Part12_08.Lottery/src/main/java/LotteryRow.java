import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

	private final Random random = new Random();
	private ArrayList<Integer> numbers;

	public LotteryRow() {
		// Draw the numbers when the LotteryRow is created
		this.randomizeNumbers();
	}

	public ArrayList<Integer> numbers() {
		return this.numbers;
	}

	public void randomizeNumbers() {
		// Initialize the list for numbers
		this.numbers = new ArrayList<>();
		// Implement the random number generation here
		// the method containsNumber is probably useful

		while (this.numbers.size() < 7) {
			int randomNumber = this.random.nextInt(40) + 1;

			if (!this.numbers.contains(randomNumber)) {
				this.numbers.add(randomNumber);
			}
		}
	}

	public boolean containsNumber(int number) {
		// Check here whether the number is among the drawn numbers
		boolean found = false;

		for (int value : numbers) {
			if (value == number) {
				found = true;
				break;
			}
		}

		return found;
	}
}