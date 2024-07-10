import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {
	private final List<T> hideoutList;

	public Hideout() {
		hideoutList = new ArrayList<>();
	}

	public boolean isInHideout() {
		return !hideoutList.isEmpty();
	}

	public T takeFromHideout() {
		T value = hideoutList.get(0);
		hideoutList.clear();
		return value;
	}

	public void putIntoHideout(T toHide) {
		if (!isInHideout()) {
			hideoutList.clear();
		}

		hideoutList.add(toHide);
	}
}
