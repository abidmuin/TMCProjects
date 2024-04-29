
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = "";
		int inputCount = 0;

		int currentNameSize = 0;
		int maxNameSize = 0;
		String name = "";

		int currentYear = 0;
		double totalYears = 0;

		while (true) {
			inputString = scanner.nextLine();

			if (inputString.isEmpty()) {
				break;
			}

			currentYear = Integer.parseInt(inputString.split(",")[1]);
			totalYears += currentYear;
			inputCount++;

			currentNameSize = inputString.split(",")[0].length();

			if (currentNameSize > maxNameSize) {
				maxNameSize = currentNameSize;
				name = inputString.split(",")[0];
			}
		}

		System.out.println("Longest name: " + name);
		System.out.println("Average of the birth years: " + (totalYears / inputCount));

		scanner.close();
	}
}
