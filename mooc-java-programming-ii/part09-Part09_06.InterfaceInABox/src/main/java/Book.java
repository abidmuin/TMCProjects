public class Book implements Packable {
	private final String authorName;
	private final String bookName;
	private final double bookWeight;

	public Book(String authorName, String bookName, double bookWeight) {
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookWeight = bookWeight;
	}

	@Override
	public double weight() {
		return this.bookWeight;
	}

	public String getAuthorName() {
		return authorName;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public String toString() {
		return getAuthorName() + ": " + getBookName();
	}
}
