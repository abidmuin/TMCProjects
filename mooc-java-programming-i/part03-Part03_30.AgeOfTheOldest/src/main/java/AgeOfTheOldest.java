
import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = "";
		int currentAge = Integer.MIN_VALUE;
		int maxAge = Integer.MIN_VALUE;

		while (true) {
			inputString = scanner.nextLine();

			if (inputString.isEmpty()) {
				break;
			}

			currentAge = Integer.parseInt(inputString.split(",")[1]);

			if (currentAge > maxAge) {
				maxAge = currentAge;
			}
		}

		System.out.println(maxAge);
		scanner.close();
	}
}
