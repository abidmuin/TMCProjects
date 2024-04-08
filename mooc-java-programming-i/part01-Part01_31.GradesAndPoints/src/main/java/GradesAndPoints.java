
import java.util.Scanner;

public class GradesAndPoints {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Give points [0-100]:");
		int gradePoints = Integer.valueOf(scan.nextLine());

		if (gradePoints < 0) {
			System.out.println("impossible!");
		} else if (gradePoints < 50) {
			System.out.println("failed");
		} else if (gradePoints < 60) {
			System.out.println("1");
		} else if (gradePoints < 70) {
			System.out.println("2");
		} else if (gradePoints < 80) {
			System.out.println("3");
		} else if (gradePoints < 90) {
			System.out.println("4");
		} else if (gradePoints <= 100) {
			System.out.println("5");
		} else {
			System.out.println("incredible!");
		}

		scan.close();
	}
}
