import java.util.ArrayList;

public class Room {
	private final ArrayList<Person> persons;

	public Room() {
		this.persons = new ArrayList<>();
	}

	public void add(Person person) {
		persons.add(person);
	}

	public boolean isEmpty() {
		return persons.isEmpty();
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public Person shortest() {
		if (persons.isEmpty()) {
			return null;
		}

		Person shortestPerson = new Person("", 0);
		int shortestHeight = Integer.MAX_VALUE;

		for (Person person : persons) {
			if (person.getHeight() < shortestHeight) {
				shortestHeight = person.getHeight();
				shortestPerson = person;
			}
		}

		return shortestPerson;
	}

	public Person take() {
		if (!persons.isEmpty()) {
			Person shortestPerson = new Person("", 0);
			int shortestHeight = Integer.MAX_VALUE;

			for (Person person : persons) {
				if (person.getHeight() < shortestHeight) {
					shortestHeight = person.getHeight();
					shortestPerson = person;
				}
			}

			persons.remove(shortestPerson);

			return shortestPerson;
		}

		return null;
	}
}
