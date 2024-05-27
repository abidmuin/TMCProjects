import java.util.Scanner;

public class UserInterface {
	private final JokeManager jokes;
	private final Scanner scanner;

	public UserInterface(JokeManager jokeManager, Scanner scanner) {
		this.jokes = jokeManager;
		this.scanner = scanner;
	}

	public void start() {
		while (true) {
			System.out.println("Commands:");
			System.out.println("1 - add a joke");
			System.out.println("2 - draw a joke");
			System.out.println("3 - list jokes");
			System.out.println("X - stop");

			String command = this.scanner.nextLine();
			switch (command) {
				case "1":
					System.out.println("Write the joke to be added:");
					String joke = this.scanner.nextLine();
					jokes.addJoke(joke);
					break;
				case "2":
					System.out.println(jokes.drawJoke());
					break;
				case "3":
					System.out.println("Printing the jokes.");
					jokes.printJokes();
					break;
				case "X":
					return;
			}
		}
	}
}
