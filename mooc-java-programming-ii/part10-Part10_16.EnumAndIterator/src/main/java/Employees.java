import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private final List<Person> employees;

	public Employees() {
		employees = new ArrayList<>();
	}

	public void add(Person personToAdd) {
		employees.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		employees.addAll(peopleToAdd);
	}

	public void print() {
		Iterator<Person> iterator = employees.iterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person);
		}
	}

	public void print(Education education) {
		Iterator<Person> iterator = employees.iterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				System.out.println(person);
			}
		}
	}

	public void fire(Education education) {
		employees.removeIf(person -> person.getEducation() == education);
	}
}
