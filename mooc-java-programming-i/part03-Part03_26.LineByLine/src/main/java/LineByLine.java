
import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userInput = "";
		String sentence = "";
		String[] arrayWords;

		while (true) {
			userInput = scanner.nextLine();

			if (userInput.isEmpty()) {
				break;
			}

			arrayWords = userInput.split(" ");

			for (String word : arrayWords) {
				System.out.println(word);
			}
		}

		scanner.close();
	}
}
