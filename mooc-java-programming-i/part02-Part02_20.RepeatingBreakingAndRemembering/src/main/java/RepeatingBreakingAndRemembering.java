
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

	public static void main(String[] args) {

		// This exercise is worth five exercise points, and it is
		// gradually extended part by part.

		// If you want, you can send this exercise to the server
		// when it's just partially done. In that case the server will complain about
		// the parts you haven't done, but you'll get points for the finished parts.

		Scanner scanner = new Scanner(System.in);

		System.out.println("Give numbers:");
		int number = 0;
		int result = 0;
		int numberCount = 0;
		int evenCount = 0;
		int oddCount = 0;

		while (true) {
			number = Integer.valueOf(scanner.nextLine());

			if (number == -1) {
				System.out.println("Thx! Bye!");
				break;
			}

			if (number % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}

			result += number;
			numberCount++;
		}

		System.out.println("Sum: " + result);
		System.out.println("Numbers: " + numberCount);
		System.out.println("Average: " + (result / (numberCount * 1.0)));
		System.out.println("Even: " + evenCount);
		System.out.println("Odd: " + oddCount);

		scanner.close();
	}
}
