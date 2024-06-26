import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadingFilesPerLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// test the method here

	}

	public static List<String> read(String file) {
		List<String> data = new ArrayList<>();

		try (Stream<String> lines = Files.lines(Paths.get(file))) {
			lines.forEach(data::add);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		return data;
	}
}
