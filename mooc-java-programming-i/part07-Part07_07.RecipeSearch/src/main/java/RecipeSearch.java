import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class RecipeSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("File to read: ");
		String filename = scanner.nextLine();

		List<Recipe> recipes;

		try {
			recipes = RecipeReader.readRecipes(filename);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}

		System.out.println();
		System.out.println("Commands:");
		System.out.println("list - lists the recipes");
		System.out.println("stop - stops the program");
		System.out.println("find name - searches recipes by name");
		System.out.println("find cooking time - searches recipes by cooking time");
		System.out.println("find ingredient - searches recipes by ingredient");
		System.out.println();

		while (true) {
			System.out.print("Enter command: ");
			String command = scanner.nextLine().trim().toLowerCase();

			if (command.equals("stop")) {
				break;
			} else if (command.equals("list")) {
				listRecipes(recipes);
			} else if (command.equals("find name")) {
				System.out.print("Searched word: ");
				String name = scanner.nextLine().trim().toLowerCase();
				findRecipesByName(recipes, name);
			} else if (command.equals("find cooking time")) {
				System.out.print("Max cooking time: ");
				int time = scanner.nextInt();
				findRecipesByCookingTime(recipes, time);
			} else if (command.equals("find ingredient")) {
				System.out.print("Ingredient: ");
				String ingredient = scanner.nextLine().trim().toLowerCase();
				findRecipesByIngredient(recipes, ingredient);
			}
		}
	}

	// Part 01
	private static void listRecipes(List<Recipe> recipes) {
		System.out.println("Recipes:");

		for (Recipe recipe : recipes) {
			System.out.println(recipe);
		}
	}

	// Part 02
	private static void findRecipesByName(List<Recipe> recipes, String name) {
		System.out.println("Recipes:");

		for (Recipe recipe : recipes) {
			if (recipe.getName().contains(name)) {
				System.out.println(recipe);
			}
		}
	}

	// Part 03
	private static void findRecipesByCookingTime(List<Recipe> recipes, int time) {
		System.out.println("Recipes:");

		for (Recipe recipe : recipes) {
			if (recipe.getCookingTime() <= time) {
				System.out.println(recipe);
			}
		}
	}

	// Part 04
	private static void findRecipesByIngredient(List<Recipe> recipes, String ingredient) {
		System.out.println("Recipes:");

		for (Recipe recipe : recipes) {
			if (recipe.getIngredients().contains(ingredient)) {
				System.out.println(recipe);
			}
		}
	}
}
