import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// implement here your program that uses the TelevisionProgram class

		ArrayList<TelevisionProgram> programs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		String name = "";
		int duration = 0;

		while (true) {
			name = scanner.nextLine();

			if (name.isEmpty()) {
				break;
			}
			duration = Integer.valueOf(scanner.nextLine());

			programs.add(new TelevisionProgram(name, duration));
		}

		System.out.print("Program's maximum duration? ");
		duration = Integer.valueOf(scanner.nextLine());

		for (TelevisionProgram televisionProgram : programs) {
			if (televisionProgram.getDuration() <= duration) {
				System.out.print(televisionProgram.toString());
			}
		}
		scanner.close();
	}
}
