import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SportStatistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("File: ");
		String fileName = scan.nextLine();

		System.out.println("Team: ");
		String teamName = scan.nextLine();

		String[] lineParts;
		String firstTeam = "";
		String secondTeam = "";

		int firstTeamScore = 0;
		int secondTeamScore = 0;

		HashMap<String, TeamStatistics> teamStats = new HashMap<>();

		try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
			while (fileScanner.hasNextLine()) {
				lineParts = fileScanner.nextLine().split(",");

				firstTeam = lineParts[0];
				secondTeam = lineParts[1];

				firstTeamScore = Integer.parseInt(lineParts[2]);
				secondTeamScore = Integer.parseInt(lineParts[3]);

				// Processing for First Team
				if (teamStats.containsKey(firstTeam)) {
					if (firstTeamScore > secondTeamScore) {
						teamStats.get(firstTeam).addWin();
					} else {
						teamStats.get(firstTeam).addLoss();
					}
				} else {
					if (firstTeamScore > secondTeamScore) {
						teamStats.put(firstTeam, new TeamStatistics(firstTeam, 1, 0));
					} else {
						teamStats.put(firstTeam, new TeamStatistics(firstTeam, 0, 1));
					}
				}

				// Processing for Second Team
				if (teamStats.containsKey(secondTeam)) {
					if (secondTeamScore > firstTeamScore) {
						teamStats.get(secondTeam).addWin();
					} else {
						teamStats.get(secondTeam).addLoss();
					}
				} else {
					if (secondTeamScore > firstTeamScore) {
						teamStats.put(secondTeam, new TeamStatistics(secondTeam, 1, 0));
					} else {
						teamStats.put(secondTeam, new TeamStatistics(secondTeam, 0, 1));
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Error file opening: " + e.getMessage());
		}

		TeamStatistics teamStatsForTeam = teamStats.get(teamName);
		if (teamStatsForTeam != null) {
			System.out.println(teamStatsForTeam);
		} else {
			System.out.println("Games: " + 0);
			System.out.println("Wins: " + 0);
			System.out.println("Losses: " + 0);
		}

		scan.close();
	}
}