
public class Person {

	private String name;
	private SimpleDate birthday;
	private int height;
	private int weight;

	public Person(String name, SimpleDate birthday, int height, int weight) {
		this.name = name;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
	}

	// implement an equals method here for checking the equality of objects
	public boolean equals(Object compared) {
		if (this == compared) {
			return true;
		}

		if (compared == null || getClass() != compared.getClass()) {
			return false;
		}

		Person comparedPerson = (Person) compared;

		if (!this.name.equals(comparedPerson.name)) {
			return false;
		}

		if (!this.birthday.equals(comparedPerson.birthday)) {
			return false;
		}

		if (this.weight != comparedPerson.weight) {
			return false;
		}

		if (this.height != comparedPerson.height) {
			return false;
		}

		return true;
	}
}
