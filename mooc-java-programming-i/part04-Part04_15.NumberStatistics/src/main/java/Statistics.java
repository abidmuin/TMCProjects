public class Statistics {
	private int count;
	private int sum;

	public Statistics() {
		// initialize the variables count and sum here
		this.count = 0;
		this.sum = 0;

	}

	public void addNumber(int number) {
		// write code here
		this.sum += number;
		this.count++;
	}

	public int getCount() {
		// write code here
		return this.count;
	}

	public int sum() {
		// write code here
		return this.sum;
	}

	public double average() {
		// write code here
		double average = 0.0;

		if (this.count > 0) {
			average = ((this.sum * 1.0) / this.count);
		}

		return average;
	}
}