
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Name of the file:");
		String fileName = scanner.nextLine();

		String name = "";
		String age = "";
		String row = "";

		try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
			while (fileScanner.hasNextLine()) {
				row = fileScanner.nextLine();
				name = row.split(",")[0];
				age = row.split(",")[1];
				System.out.println(name + "age: " + age + " years");
			}

		} catch (Exception e) {
			System.out.println("Error opening file: " + e.getMessage());
		}

		scanner.close();
	}
}
