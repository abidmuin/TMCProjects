import java.util.ArrayList;

public class TodoList {

	private final ArrayList<String> todos;

	public TodoList() {
		this.todos = new ArrayList<>();
	}

	public void add(String task) {
		this.todos.add(task);
	}

	public void print() {
		int index = 1;
		for (String todo : this.todos) {
			System.out.println(index + ": " + todo);
			index++;
		}
	}

	public void remove(int number) {
		this.todos.remove(number - 1);
	}
}
