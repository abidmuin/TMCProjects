
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

	public static void main(String[] args) {
		// implement here your program that uses the class Item

		ArrayList<Item> items = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		String name = "";

		while (scanner.hasNextLine()) {
			System.out.println("Name: ");
			Item item = new Item(scanner.nextLine());
			items.add(item);
			System.out.println(item.toString());
		}

		scanner.close();
	}
}
