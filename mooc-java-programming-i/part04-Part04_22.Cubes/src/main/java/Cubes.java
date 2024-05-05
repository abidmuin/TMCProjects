
import java.util.Scanner;

public class Cubes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String inputString = "";
		int number = 0;

		while (true) {
			inputString = scanner.nextLine();

			if (inputString.equals("end")) {
				break;
			}

			number = Integer.valueOf(inputString);

			System.out.println(number * number * number);
		}

		scanner.close();
	}
}
