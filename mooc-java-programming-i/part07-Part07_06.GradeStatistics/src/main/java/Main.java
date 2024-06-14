import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here -- consider breaking the program into
		// multiple classes.

		pointAverage();
	}

	public static boolean validPoint(int point) {
		return (point >= 0 && point <= 100);
	}

	public static boolean passedPoint(int point) {
		return (point >= 50 && point <= 100);
	}

	public static void pointAverage() {
		Scanner scanner = new Scanner(System.in);

		int totalPoints = 0;
		int counterPoints = 0;
		double averagePoints = 0;

		int totalPassedPoints = 0;
		int totalPassedCounter = 0;
		double averagePassedPoints = 0;

		System.out.println("Enter point totals, -1 stops:");

		while (true) {
			int points = scanner.nextInt();
			if (points == -1) {
				break;
			}

			if (validPoint(points)) {
				totalPoints += points;
				counterPoints++;

				if (passedPoint(points)) {
					totalPassedPoints += points;
					totalPassedCounter++;
				}
			}
		}

		averagePoints = totalPoints / counterPoints;
		averagePassedPoints = totalPassedPoints / totalPassedCounter;

		System.out.println("Point average (all): " + averagePoints);
		System.out.println("Point average (passing): " + averagePassedPoints);
	}
}
