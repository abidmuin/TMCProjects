
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File? ");
		String file = scanner.nextLine();

		System.out.print("Lower bound? ");
		int lowerBound = Integer.valueOf(scanner.nextLine());

		System.out.print("Upper bound? ");
		int upperBound = Integer.valueOf(scanner.nextLine());

		int currentNumber = 0;
		int numberCount = 0;

		try (Scanner fileScanner = new Scanner(Paths.get(file))) {

			while (fileScanner.hasNextLine()) {
				currentNumber = Integer.valueOf(fileScanner.nextLine());

				if (currentNumber >= lowerBound && currentNumber <= upperBound) {
					numberCount++;
				}
			}

		} catch (Exception e) {
			System.out.println("Failed to open: " + e.getMessage());
		}

		System.out.println("Numbers: " + numberCount);
		scanner.close();
	}

}
