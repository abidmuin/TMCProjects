public class SimpleDate {

	private final int day;
	private final int month;
	private final int year;

	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(SimpleDate other) {
		if (this.year < other.year) {
			return true;
		}

		if (this.year == other.year && this.month < other.month) {
			return true;
		}

		return this.year == other.year && this.month == other.month && this.day < other.day;
	}

	public int differenceInYears(SimpleDate other) {
		if (earlier(other)) {
			return other.differenceInYears(this);
		}

		int yearRemoved = 0;

		if (this.month < other.month) {
			yearRemoved = 1;
		} else if (this.month == other.month && this.day < other.day) {
			yearRemoved = 1;
		}

		return this.year - other.year - yearRemoved;
	}

	public boolean equals(Object object) {
		if (!(object instanceof SimpleDate)) {
			return false;
		}

		SimpleDate newObject = (SimpleDate) object;

		return this.year == newObject.year && this.month == newObject.month && this.day == newObject.day;
	}
}
