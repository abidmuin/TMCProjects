
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("File: ");
		String fileName = scan.nextLine();

		String row = "";
		String firstTeam = "";
		String secondTeam = "";

		int firstTeamScore = 0;
		int secondTeamScore = 0;

		HashMap<String, TeamStatistics> teamStatistics = new HashMap<String, TeamStatistics>();

		try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
			while (fileScanner.hasNextLine()) {
				row = fileScanner.nextLine();

				firstTeam = row.split(",")[0];
				secondTeam = row.split(",")[1];

				firstTeamScore = Integer.valueOf(row.split(",")[2]);
				secondTeamScore = Integer.valueOf(row.split(",")[3]);

				if (firstTeamScore > secondTeamScore) {
					if (!teamStatistics.containsKey(firstTeam)) {
						teamStatistics.put(firstTeam, )
					}
				} else {
				}

			}
		} catch (Exception e) {
			System.out.println("Error file opening: " + e.getMessage());
		}

		scan.close();
	}
}
