
import java.util.Scanner;

public class FirstWords {

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

			for (String word : words) {
				System.out.println(word);
				break;
			}
		}
		scanner.close();
	}
}
