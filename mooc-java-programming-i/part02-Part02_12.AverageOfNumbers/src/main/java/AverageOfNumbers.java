
import java.util.Scanner;

public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double result = 0;
		int totalInput = 0;

		while (true) {
			System.out.println("Give a number:");
			int number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				System.out.println("Average of the numbers: " + (result / totalInput));
				break;
			} else {
				totalInput++;
				result += number;
			}
		}

		scanner.close();
	}
}
