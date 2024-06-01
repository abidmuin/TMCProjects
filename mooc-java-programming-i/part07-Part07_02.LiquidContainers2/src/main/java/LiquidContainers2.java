import java.util.Scanner;

public class LiquidContainers2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Container firstContainer = new Container();
		Container secondContainer = new Container();
		int containerCapacity = 100;

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
					firstContainer.add(amount);
					break;
				case "move":
					if (amount > 0) {
						int currentSize = firstContainer.contains();
						if (currentSize >= amount) {
							firstContainer.remove(amount);

							int expectedSecondContainerSize = secondContainer.contains() + amount;

							if (expectedSecondContainerSize <= containerCapacity) {
								secondContainer.add(amount);
							} else {
								secondContainer.add(containerCapacity - secondContainer.contains());
							}
						} else {
							secondContainer.add(currentSize);
							firstContainer.remove(currentSize);
						}
					}
					break;
				case "remove":
					if (amount > 0) {
						secondContainer.remove(amount);
					}
					break;
			}
		}
	}

}
