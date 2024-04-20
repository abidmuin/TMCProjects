
import java.util.Scanner;

public class SumOfASequenceTheSequel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number?");
		int firstNumber = Integer.valueOf(scanner.nextLine());

		System.out.println("Last number?");
		int secondNumber = Integer.valueOf(scanner.nextLine());

		if (firstNumber < secondNumber) {
			int diff = secondNumber - firstNumber + 1;
			int result = ((diff) * (firstNumber + secondNumber)) / 2;
			System.out.println("The sum is: " + result);
		} else {
			int diff = firstNumber - secondNumber + 1;
			int result = ((diff) * (firstNumber + secondNumber)) / 2;
			System.out.println("The sum is: " + result);
		}

		scanner.close();
	}
}
