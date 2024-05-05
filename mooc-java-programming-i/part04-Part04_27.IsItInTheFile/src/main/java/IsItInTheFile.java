import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String fileName = scanner.nextLine();

		System.out.println("Search for:");
		String searchedFor = scanner.nextLine();

		try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
			String row = "";
			boolean isFound = false;

			while (fileScanner.hasNextLine()) {
				row = fileScanner.nextLine();

				if (row.isEmpty()) {
					break;
				}

				if (row.equals(searchedFor)) {
					isFound = true;
					break;
				}
			}

			if (isFound) {
				System.out.println("Found!");
			} else {
				System.out.println("Not found.");
			}

			fileScanner.close();
		} catch (Exception e) {
			System.out.println("Reading the file " + fileName + " failed.");
			System.exit(1);
		}

		scanner.close();
	}
}
