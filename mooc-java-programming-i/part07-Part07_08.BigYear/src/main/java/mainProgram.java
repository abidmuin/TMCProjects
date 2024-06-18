import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainProgram {
	private final Scanner scanner;
	private final List<Bird> birds;

	public mainProgram() {
		this.scanner = new Scanner(System.in);
		this.birds = new ArrayList<>();
	}

	public static void main(String[] args) {
		// NB! Do not create other scanner objects than the one below
		// if and when you create other classes, pass the scanner to them
		// as a parameter

		mainProgram program = new mainProgram();
		program.userInterface();
	}

	public void userInterface() {
		while (true) {
			System.out.print("? ");
			String command = scanner.nextLine().trim();
			switch (command) {
				case "Add":
					addBird();
					break;
				case "Observation":
					addObservation();
					break;
				case "All":
					printAllBirds();
					break;
				case "One":
					printOneBird();
					break;
				case "Quit":
					return;
				default:
					System.out.println("Incorrect input!");
			}
		}
	}

	public void addBird() {
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();

		System.out.print("Name in Latin: ");
		String latinName = scanner.nextLine().trim();

		Bird newBird = new Bird(name, latinName);
		birds.add(newBird);
	}

	public void addObservation() {
		System.out.print("Bird? ");
		String name = scanner.nextLine().trim();

		Bird bird = findBird(name);

		if (bird != null) {
			bird.addObservation();
		} else {
			System.out.println("Not a bird!");
		}
	}

	public Bird findBird(String name) {
		for (Bird bird : birds) {
			if (bird.getName().equals(name)) {
				return bird;
			}
		}
		return null;
	}

	public void printAllBirds() {
		for (Bird bird : birds) {
			System.out.println(bird);
		}
	}

	public void printOneBird() {
		System.out.print("Bird? ");
		String name = scanner.nextLine().trim();

		Bird bird = findBird(name);

		if (bird != null) {
			System.out.println(bird);
		} else {
			System.out.println("Not a bird!");
		}
	}
}
