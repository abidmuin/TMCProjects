
import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = "";
		String name = "";
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
				name = inputString.split(",")[0];
			}
		}

		System.out.println(name);

		scanner.close();
	}
}
