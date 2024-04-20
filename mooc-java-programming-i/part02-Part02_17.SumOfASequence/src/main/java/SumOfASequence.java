
import java.util.Scanner;

public class SumOfASequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.valueOf(scanner.nextLine());
		int result = (number * (number + 1)) / 2;

		System.out.println(result);

		scanner.close();
	}
}
