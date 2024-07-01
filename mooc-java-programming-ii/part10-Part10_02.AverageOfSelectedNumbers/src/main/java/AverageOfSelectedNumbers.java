import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();

		System.out.println("Input numbers, type \"end\" to stop.");

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("end")) {
				break;
			}

			numbers.add(Integer.parseInt(input));
		}

		System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
		String input = scanner.nextLine();
		OptionalDouble average;

		if (input.equals("p")) {
			average = numbers.stream().mapToInt(x -> x).filter(x -> x >= 0).average();
			if (average.isPresent()) {
				System.out.println("Average of the positive numbers: " + average.getAsDouble());
			}
		} else if (input.equals("n")) {
			average = numbers.stream().mapToInt(x -> x).filter(x -> x < 0).average();
			if (average.isPresent()) {
				System.out.println("Average of the negative numbers: " + average.getAsDouble());
			}
		}
	}
}
