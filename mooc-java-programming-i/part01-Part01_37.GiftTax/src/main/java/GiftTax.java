
import java.util.Scanner;

public class GiftTax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Value of the gift?");
		int amount = Integer.valueOf(scan.nextLine());

		if (amount >= 5000 && amount < 25000) {
			Double tax = 100 + (amount - 5000) * 0.08;
			System.out.println("Tax: " + tax);
		} else if (amount >= 25000 && amount < 55000) {
			Double tax = 1700 + (amount - 25000) * 0.1;
			System.out.println("Tax: " + tax);
		} else if (amount >= 55000 && amount < 200000) {
			Double tax = 4700 + (amount - 55000) * 0.12;
			System.out.println("Tax: " + tax);
		} else if (amount > 200000 && amount < 1000000) {
			Double tax = 22100 + (amount - 200000) * 0.15;
			System.out.println("Tax: " + tax);
		} else if (amount >= 1000000) {
			Double tax = 142100 + (amount - 1000000) * 0.17;
			System.out.println("Tax: " + tax);
		} else {
			System.out.println("No tax!");
		}

		scan.close();
	}
}
