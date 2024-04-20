
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give a number: ");
		int number = Integer.valueOf(scanner.nextLine());

		int result = calculateFactorial(number);
		System.out.println("Factorial: " + result);

		scanner.close();
	}

	private static int calculateFactorial(Integer n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * calculateFactorial(n - 1);
	}
}
