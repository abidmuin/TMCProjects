public class LiteracyRecord {
	private final String country;
	private final String year;
	private final String gender;
	private final double literacyRate;

	public LiteracyRecord(String country, String year, String gender, double literacyRate) {
		this.country = country;
		this.year = year;
		this.gender = gender;
		this.literacyRate = literacyRate;
	}

	public String getCountry() {
		return country;
	}

	public String getYear() {
		return year;
	}

	public String getGender() {
		return gender;
	}

	public double getLiteracyRate() {
		return literacyRate;
	}
}
