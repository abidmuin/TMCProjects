
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>();
		while (true) {
			int luku = Integer.valueOf(scanner.nextLine());
			if (luku == -1) {
				break;
			}

			numbers.add(luku);
		}

		int indexValue = 0;
		while (indexValue < numbers.size()) {
			System.out.println(numbers.get(indexValue));
			indexValue++;
		}

		scanner.close();
	}
}
