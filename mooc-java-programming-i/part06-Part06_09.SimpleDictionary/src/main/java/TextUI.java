import java.util.Scanner;

public class TextUI {
	private final Scanner scanner;
	private final SimpleDictionary dictionary;

	public TextUI(Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}

	public void start() {
		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			switch (command) {
				case "add": {
					System.out.print("Word: ");
					String word = scanner.nextLine();

					System.out.print("Translation: ");
					String translation = scanner.nextLine();

					this.dictionary.add(word, translation);
					break;
				}
				case "search": {
					System.out.print("To be translated: ");
					String word = scanner.nextLine();

					if (dictionary.translate(word) == null) {
						System.out.println("Word " + word + " was not found");
					} else {
						System.out.println("Translation: " + dictionary.translate(word));
					}
					break;
				}
				case "end": {
					System.out.println("Bye bye!");
					return;
				}
				default:
					System.out.println("Unknown command");
					break;
			}
		}
	}
}
