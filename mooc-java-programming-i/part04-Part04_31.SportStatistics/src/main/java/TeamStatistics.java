public class TeamStatistics {
	private String teamName;
	private int winCount;
	private int lossCount;

	public TeamStatistics(String name, int win, int loss) {
		this.teamName = name;
		this.winCount = win;
		this.lossCount = loss;
	}

	public void addWin() {
		this.winCount++;
	}

	public void addLoss() {
		this.lossCount++;
	}

	public String getName() {
		return this.teamName;
	}

	public int getWin() {
		return this.winCount;
	}

	public int getLoss() {
		return this.lossCount;
	}

	@Override
	public String toString() {
		String result = this.teamName + "\n" + "Games: " + (this.winCount + this.lossCount) + "\n" + "Wins: "
				+ this.winCount + "\n" + "Losses: " + this.lossCount;

		return result;
	}
}
