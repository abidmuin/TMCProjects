
import java.util.HashMap;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		HashMap<String, String> credentials = new HashMap<>();
		credentials.put("alex", "sunshine");
		credentials.put("emma", "haskell");

		System.out.print("Enter username: ");
		String username = scanner.nextLine();

		System.out.print("Enter password: ");
		String password = scanner.nextLine();

		if (password.equals(credentials.get(username))) {
			System.out.println("You have successfully logged in!");
		} else {
			System.out.println("Incorrect username or password!");
		}

		scanner.close();
	}
}
