
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String fileName = scanner.nextLine();

		ArrayList<String> list = new ArrayList<>();
		// implement reading the file here.

		try {
			File file = new File(fileName);
			Scanner fileScanner = new Scanner(file);

			while (fileScanner.hasNextLine()) {
				String name = fileScanner.nextLine();
				list.add(name);
			}

			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + fileName);
			System.exit(1);
		}

		System.out.println("");

		System.out.println("Enter names, an empty line quits.");
		while (true) {
			String name = scanner.nextLine();
			if (name.isEmpty()) {
				break;
			}

			if (list.contains(name)) {
				System.out.println("The name is on the list.");
			} else {
				System.out.println("The name is not on the list.");
			}
		}

		scanner.close();
		System.out.println("Thank you!");
	}
}
