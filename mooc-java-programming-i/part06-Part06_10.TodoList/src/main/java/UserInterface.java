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
			String command = scanner.nextLine();
			switch (command) {
				case "list":
					this.list.print();
					break;
				case "add":
					System.out.print("To add: ");
					String input = scanner.nextLine();
					this.list.add(input);
					break;
				case "remove":
					System.out.print("Which one is removed? ");
					int index = scanner.nextInt();
					this.list.remove(index);
					break;
				case "stop":
					return;
			}
		}
	}
}
