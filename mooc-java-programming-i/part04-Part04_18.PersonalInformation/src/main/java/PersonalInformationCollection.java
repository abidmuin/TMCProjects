
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		// implement here your program that uses the PersonalInformation class

		ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		String firstName = "";
		String lastName = "";
		String identificationNumber = "";

		while (true) {
			firstName = scanner.nextLine();

			if (firstName.isEmpty()) {
				break;
			}

			lastName = scanner.nextLine();
			identificationNumber = scanner.nextLine();

			infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
		}

		for (PersonalInformation personalInformation : infoCollection) {
			System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
		}

		scanner.close();
	}
}
