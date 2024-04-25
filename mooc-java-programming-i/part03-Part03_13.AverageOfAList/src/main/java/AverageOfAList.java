
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// implement here a program, that first reads user input
		// adding them on a list until user gives -1.
		// Then it computes the average of the numbers on the list
		// and prints it.

		ArrayList<Integer> list = new ArrayList<>();
		int input = 0;
		double totalValue = 0, totalCount = 0;

		while (true) {
			input = Integer.valueOf(scanner.nextLine());

			if (input == -1) {
				break;
			}

			list.add(input);
			totalValue += input;
			totalCount++;
		}

		System.out.println("Average: " + (totalValue / totalCount));

		scanner.close();
	}
}
