import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input numbers, type \"end\" to stop.");

		List<Integer> numbers = new ArrayList<>();

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("end")) {
				break;
			}

			numbers.add(Integer.parseInt(input));
		}

		OptionalDouble average;
		average = numbers.stream().mapToDouble(x -> x).average();

		if (average.isPresent()) {
			System.out.println("average of the numbers: " + average.getAsDouble());
		}
	}
}
