package validating;

public class Person {

	private final String name;
	private final int age;

	public Person(String name, int age) {
		if (name == null || name.isEmpty() || name.length() > 40) {
			throw new IllegalArgumentException("Name cannot be null or empty or less than 40 characters");
		}

		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Age cannot be less than 0 or more than 120 years");
		}

		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
