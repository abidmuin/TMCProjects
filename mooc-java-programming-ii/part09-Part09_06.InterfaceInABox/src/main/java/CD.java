public class CD implements Packable {
	private final String bandName;
	private final String albumName;
	private final int releaseYear;
	private double weight;

	public CD() {
		this.bandName = "";
		this.albumName = "";
		this.releaseYear = 0;
	}

	public CD(String bandName, String albumName, int releaseYear) {
		this.bandName = bandName;
		this.albumName = albumName;
		this.releaseYear = releaseYear;
		this.weight += 0.1;
	}

	@Override
	public double weight() {
		return this.weight;
	}

	public String getBandName() {
		return bandName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	@Override
	public String toString() {
		return getBandName() + ": " + getAlbumName() + " (" + getReleaseYear() + ")";
	}
}
