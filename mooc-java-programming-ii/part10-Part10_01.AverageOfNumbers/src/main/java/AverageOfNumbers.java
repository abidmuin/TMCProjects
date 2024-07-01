import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input numbers, type \"end\" to stop.");

		int counter = 0;
		int sum = 0;
		double average;

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("end")) {
				average = (double) sum / counter;
				break;
			} else {
				int number = Integer.parseInt(input);
				sum += number;
				counter++;
			}

		}

		System.out.println("average of the numbers: " + average);
	}
}
