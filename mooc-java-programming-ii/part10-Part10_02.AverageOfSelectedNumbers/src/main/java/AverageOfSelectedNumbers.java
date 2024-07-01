import java.util.Scanner;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input numbers, type \"end\" to stop.");

		int positiveCounter = 0;
		int negativeCounter = 0;
		int positiveSum = 0;
		int negativeSum = 0;
		double average;

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("end")) {
				break;
			} else {
				int number = Integer.parseInt(input);

				if (number >= 0) {
					positiveSum += number;
					positiveCounter++;
				} else {
					negativeSum += number;
					negativeCounter++;
				}
			}
		}

		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
		String input = scanner.nextLine();

		if (input.equals("p")) {
			average = (double) positiveSum / positiveCounter;
			System.out.println("Average of the positive numbers: " + average);
		} else if (input.equals("n")) {
			average = (double) negativeSum / negativeCounter;
			System.out.println("Average of the negative numbers: " + average);
		}
	}
}
