
import java.util.Scanner;

public class NumberOfNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputCounter = 0;

		while (true) {
			System.out.println("Give a number:");
			int number = Integer.valueOf(scanner.nextLine());

			if (number == 0) {
				System.out.println("Number of numbers: " + inputCounter);
				break;
			} else {
				inputCounter++;
			}
		}

		scanner.close();
	}
}
