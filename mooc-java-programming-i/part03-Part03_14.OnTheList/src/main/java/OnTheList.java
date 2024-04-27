
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<>();

		while (true) {
			String input = scanner.nextLine();
			if (input.equals("")) {
				break;
			}

			list.add(input);
		}

		System.out.print("Search for? ");
		String searchString = scanner.nextLine();
		boolean isFound = false;

		for (String string : list) {
			if (string.equals(searchString)) {
				System.out.println(searchString + " was found!");
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println(searchString + " was not found!");
		}
		
		scanner.close();
	}
}
