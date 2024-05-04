import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// implement here the program that allows the user to enter
		// book information and to examine them
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();

		String title = "";
		int pages = 0;
		int publicationYear = 0;

		while (true) {
			title = scanner.nextLine();

			if (title.isEmpty()) {
				break;
			}

			pages = Integer.valueOf(scanner.nextLine());
			publicationYear = Integer.valueOf(scanner.nextLine());

			books.add(new Book(title, pages, publicationYear));
		}

		String info = "";
		info = scanner.nextLine();

		if (info.equals("name")) {
			for (Book book : books) {
				System.out.println(book.getTitle());
			}
		} else {
			for (Book book : books) {
				System.out.println(book.toString());
			}
		}

		scanner.close();
	}
}
