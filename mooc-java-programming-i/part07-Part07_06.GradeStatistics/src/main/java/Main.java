import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Write your program here -- consider breaking the program into
		// multiple classes.

		pointAverage(scanner);
	}

	public static boolean validPoint(int point) {
		return (point >= 0 && point <= 100);
	}

	public static boolean passedPoint(int point) {
		return (point >= 50 && point <= 100);
	}

	public static void pointAverage(Scanner scanner) {
		int totalPoints = 0;
		int counterPoints = 0;
		double averagePoints;

		int totalPassedPoints = 0;
		int totalPassedCounter = 0;
		double averagePassedPoints;

		double passPercentage = 0;

		HashMap<Integer, Integer> gradeDistribution = new HashMap<>();

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

				int grade = gradeCalculation(points);
				if (gradeDistribution.containsKey(grade)) {
					gradeDistribution.put(grade, gradeDistribution.get(grade) + 1);
				} else {
					gradeDistribution.put(grade, 1);
				}
			}
		}

		averagePoints = (double) totalPoints / counterPoints;

		System.out.println("Point average (all): " + averagePoints);

		if (totalPassedCounter > 0) {
			averagePassedPoints = (double) totalPassedPoints / totalPassedCounter;
			System.out.println("Point average (passing): " + averagePassedPoints);
		} else {
			System.out.println("Point average (passing): -");
		}

		if (totalPassedCounter > 0) {
			passPercentage = ((double) totalPassedCounter / counterPoints) * 100;
			System.out.println("Pass percentage: " + passPercentage);
		} else {
			System.out.println("Pass percentage: " + passPercentage);
		}

		printGradeDistribution(gradeDistribution);
	}

	public static int gradeCalculation(int point) {
		if (point < 50) {
			return 0;
		} else if (point < 60) {
			return 1;
		} else if (point < 70) {
			return 2;
		} else if (point < 80) {
			return 3;
		} else if (point < 90) {
			return 4;
		}

		return 5;
	}

	public static void printGradeDistribution(HashMap<Integer, Integer> gradeDistribution) {
		for (int i = 5; i >= 0; i--) {
			System.out.print(i + ": ");
			int count = gradeDistribution.getOrDefault(i, 0);
			for (int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
