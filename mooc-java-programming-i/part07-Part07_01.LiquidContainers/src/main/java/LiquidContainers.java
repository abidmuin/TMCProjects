import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstContainer = 0;
		int secondContainer = 0;
		int containerCapacity = 100;

		while (true) {
			System.out.println("First: " + firstContainer + "/" + containerCapacity);
			System.out.println("Second: " + secondContainer + "/" + containerCapacity);

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
						if (firstContainer + amount >= containerCapacity) {
							firstContainer = containerCapacity;
						} else {
							firstContainer += amount;
						}
					}
					break;
				case "move":
					if (amount > 0) {
						if (firstContainer >= amount) {
							firstContainer -= amount;

							if (secondContainer + amount >= containerCapacity) {
								secondContainer = containerCapacity;
							} else {
								secondContainer += amount;
							}
						} else {
							if (secondContainer + firstContainer >= containerCapacity) {
								secondContainer = containerCapacity;
							} else {
								secondContainer += firstContainer;
							}

							firstContainer = 0;
						}
					}
					break;
				case "remove":
					if (amount > 0) {
						if (secondContainer >= amount) {
							secondContainer -= amount;
						}
					}
					break;
			}
		}
	}
}
