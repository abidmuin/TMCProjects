import java.util.Scanner;

public class UserInterface {
	private final Scanner scanner;
	private final TodoList todoList;

	public UserInterface(TodoList todoList, Scanner scanner) {
		this.todoList = todoList;
		this.scanner = scanner;
	}

	public void start() {

		while (true) {
			System.out.print("Command: ");
			String command = scanner.nextLine();

			if (command.equals("stop")) {
				break;
			} else if (command.equals("add")) {
				System.out.print("To add: ");
				String input = scanner.nextLine();
				todoList.add(input);
			} else if (command.equals("remove")) {
				System.out.print("Which one is removed? ");
				int input = scanner.nextInt();
				todoList.remove(input);
			} else if (command.equals("list")) {
				todoList.print();
			}
		}
	}
}