import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<Book>();

		while (true) {
			System.out.print("Input the name of the book, empty stops: ");
			String name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}

			System.out.print("Input the age recommendation: ");
			int age = Integer.parseInt(scanner.nextLine());

			books.add(new Book(name, age));
		}

		scanner.close();

		Collections.sort(books, Comparator.comparing(Book::getAge).thenComparing(Book::getName));

		System.out.println(books.size() + " books in total.");
		System.out.println("Books:");
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
}
