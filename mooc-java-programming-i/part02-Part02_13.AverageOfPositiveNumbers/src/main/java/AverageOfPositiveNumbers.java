
import java.util.Scanner;

public class AverageOfPositiveNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 0;
		int totalInput = 0;
		double result = 0;

		while (true) {
			number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				if (totalInput == 0) {
					System.out.println("Cannot calculate the average");
				} else {
					System.out.println(result / totalInput);
				}
				
				break;
			} else if (number > 0) {
				totalInput++;
				result += number;
			}
		}
		scanner.close();
	}
}
