public class Human implements Comparable<Human> {

	private final int wage;
	private final String name;

	public Human(String name, int wage) {
		this.name = name;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public int getWage() {
		return wage;
	}


	@Override
	public String toString() {
		return name + " " + wage;
	}

	@Override
	public int compareTo(Human another) {
		return Integer.compare(another.wage, this.wage);
	}
}
