import java.util.Objects;

public class Song {

	private String artist;
	private String name;
	private int durationInSeconds;

	public Song(String artist, String name, int durationInSeconds) {
		this.artist = artist;
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}

	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (object == null || getClass() != object.getClass()) {
			return false;
		}

		Song newSong = (Song) object;

		if (this.durationInSeconds != newSong.durationInSeconds) {
			return false;
		}

		if (!Objects.equals(this.artist, newSong.artist)) {
			return false;
		}

		return Objects.equals(this.name, newSong.name);
	}

	@Override
	public String toString() {
		return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
	}
}
