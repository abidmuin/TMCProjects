import java.util.Scanner;

public class UserInterface {
	private final TodoList list;
	private final Scanner scanner;

	public UserInterface(TodoList list, Scanner scanner) {
		this.list = list;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			if (scanner.hasNextLine()) {
				String command = scanner.nextLine();

				switch (command) {
					case "stop":
						return;
					case "add":
						System.out.print("To add: ");
						String word = scanner.nextLine();
						list.add(word);
						break;
					case "list":
						list.print();
						break;
					case "remove":
						int number = scanner.nextInt();
						list.remove(number);
					default:
						throw new IllegalStateException("Unexpected value: " + command);
				}
			}
		}
	}
}
