import java.util.Scanner;

public class LiquidContainers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int firstContainer = 0;
		int secondContainer = 0;
		int maxContainerCapacity = 100;

		while (true) {
			System.out.println("First: " + firstContainer + "/" + maxContainerCapacity);
			System.out.println("Second: " + secondContainer + "/" + maxContainerCapacity);

			String input = scan.nextLine();
			if (input.equals("quit")) {
				break;
			}

			String[] tokens = input.split(" ");
			String command = tokens[0];
			int amount = Integer.parseInt(tokens[1]);

			if (command.equals("add")) {
				if (amount > 0) {
					if (firstContainer + amount <= maxContainerCapacity) {
						firstContainer += amount;
					} else {
						firstContainer = maxContainerCapacity;
					}
				}
			} else if (command.equals("move")) {
				if (amount > 0 && firstContainer > 0) {
					if (firstContainer - amount <= 0) {
						if (secondContainer + amount <= maxContainerCapacity) {
							secondContainer += firstContainer;
						} else if (secondContainer + amount > maxContainerCapacity) {
							secondContainer = maxContainerCapacity;
						}

						firstContainer = 0;
					} else {
						if (secondContainer + amount <= maxContainerCapacity) {
							secondContainer += amount;
						} else {
							secondContainer = maxContainerCapacity;
						}

						firstContainer -= amount;
					}
				}
			} else if (command.equals("remove")) {
				if (amount > 0 && secondContainer > 0) {
					if (secondContainer - amount > 0) {
						secondContainer -= amount;
					} else {
						secondContainer = 0;
					}
				}
			}
		}
	}
}