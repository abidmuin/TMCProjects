
import java.util.Scanner;

public class FromWhereToWhere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here
		System.out.println("Where to?");
		int end = Integer.valueOf(scanner.nextLine());

		System.out.println("Where from?");
		int start = Integer.valueOf(scanner.nextLine());

		while (start <= end) {
			System.out.println(start);
			start++;
		}

		scanner.close();
	}
}
