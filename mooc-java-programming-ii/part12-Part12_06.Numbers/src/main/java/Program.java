import java.util.Random;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many random numbers should be printed?");
		int count = scanner.nextInt();

		Random random = new Random();

		while (count > 0) {
			System.out.println(random.nextInt(11));
			count--;
		}
	}
}
