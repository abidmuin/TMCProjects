
import java.util.ArrayList;

public class RemoveLast {

	public static void main(String[] args) {
		// Try your method in here
		ArrayList<String> strings = new ArrayList<>();

		strings.add("First");
		strings.add("Second");
		strings.add("Third");

		System.out.println(strings);

		removeLast(strings);
		removeLast(strings);

		System.out.println(strings);
	}

	public static void removeLast(ArrayList<String> strings) {
		int stringSize = strings.size();
		if (stringSize > 0) {
			strings.remove(stringSize - 1);
		}
	}
}
