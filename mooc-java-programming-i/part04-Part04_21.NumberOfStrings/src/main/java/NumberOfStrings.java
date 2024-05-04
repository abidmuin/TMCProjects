
import java.util.Scanner;

public class NumberOfStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String word = "";
		int inputCount = 0;

		while (true) {
			word = scanner.nextLine();

			if (word.equals("end")) {
				break;
			}

			inputCount++;
		}

		System.out.println(inputCount);

		scanner.close();
	}
}
