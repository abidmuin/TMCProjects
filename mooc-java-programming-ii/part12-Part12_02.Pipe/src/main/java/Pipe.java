import java.util.ArrayList;

public class Pipe<T> {
	private final ArrayList<T> pipeArray;

	public Pipe() {
		this.pipeArray = new ArrayList<>();
	}

	public void putIntoPipe(T value) {
		pipeArray.add(value);
	}

	public T takeFromPipe() {
		if (pipeArray.isEmpty()) {
			return null;
		}

		return pipeArray.remove(0);
	}

	public boolean isInPipe() {
		return !pipeArray.isEmpty();
	}

}
