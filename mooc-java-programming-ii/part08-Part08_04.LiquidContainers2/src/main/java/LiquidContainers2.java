import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Container firstContainer = new Container();
		Container secondContainer = new Container();

		while (true) {
			System.out.println("First: " + firstContainer);
			System.out.println("Second: " + secondContainer);

			String input = scanner.nextLine();
			if (input.equals("quit")) {
				break;
			}

			String[] tokens = input.split(" ");
			String command = tokens[0];
			int amount = Integer.parseInt(tokens[1]);

			switch (command) {
				case "add":
					if (amount > 0) {
						firstContainer.add(amount);
					}
					break;
				case "remove":
					if (amount > 0) {
						secondContainer.remove(amount);
					}
					break;
				case "move":
					if ((amount > 0) && (firstContainer.contains() > 0)) {
						if (amount > firstContainer.contains()) {
							secondContainer.add(firstContainer.contains());
							firstContainer.remove(amount);
						} else {
							secondContainer.add(amount);
							firstContainer.remove(amount);
						}
					}
					break;
			}
		}
	}
}
