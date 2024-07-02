import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// test your method here

	}

	public static List<Book> readBooks(String file) {
		List<Book> books = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			return reader.lines().map(line -> line.split(",")).filter(parts -> parts.length == 4).map(parts -> new Book(parts[0].trim(), Integer.parseInt(parts[1].trim()), Integer.parseInt(parts[2].trim()), parts[3].trim())).collect(Collectors.toList());
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		return books;
	}
}
