import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RecipeSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File to read: ");
		String filename = scanner.nextLine();
//		String filename = "recipes.txt";

		System.out.println();
		System.out.println("Commands:");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
//		System.out.println("find name - searches recipes by name");
//		System.out.println("find cooking time - searches recipes by cooking time");
//		System.out.println("find ingredient - searches recipes by ingredient");
		System.out.println();


		while (true) {
			System.out.print("Enter Command: ");
			String command = scanner.nextLine().trim().toLowerCase();

			if (command.equals("stop")) {
				break;
			} else if (command.equals("list")) {

			}
		}
	}
}
