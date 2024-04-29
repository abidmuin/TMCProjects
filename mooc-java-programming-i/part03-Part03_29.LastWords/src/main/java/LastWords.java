
import java.util.Scanner;

public class LastWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = "";
		String[] words;

		while (true) {
			inputString = scanner.nextLine();

			if (inputString.isEmpty()) {
				break;
			}

			words = inputString.split(" ");

			System.out.println(words[words.length - 1]);
		}

		scanner.close();
	}
}
