import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> limitedNumbers = new ArrayList<>();

		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();

			if (n < 0) {
				break;
			}

			limitedNumbers.add(n);
		}

		limitedNumbers = limitedNumbers.stream().filter(x -> x > 0 && x < 6).collect(Collectors.toList());

		limitedNumbers.forEach(System.out::println);
	}
}
