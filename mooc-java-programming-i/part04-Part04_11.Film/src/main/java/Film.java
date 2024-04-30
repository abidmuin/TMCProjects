public class Film {
	private String filmName;
	private int filmAgeRating;

	public Film(String filmName, int filmAgeRating) {
		this.filmName = filmName;
		this.filmAgeRating = filmAgeRating;
	}

	public String name() {
		return this.filmName;
	}

	public int ageRating() {
		return this.filmAgeRating;
	}
}
