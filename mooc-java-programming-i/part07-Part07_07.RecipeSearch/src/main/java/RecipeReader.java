import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecipeReader {
	public static List<Recipe> readRecipes(String filename) throws IOException {
		List<Recipe> recipes = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;

		while ((line = reader.readLine()) != null) {
			if (line.trim().isEmpty()) {
				continue;
			}

			String name = line.trim();
			int cookingTime = Integer.parseInt(reader.readLine().trim());
			List<String> ingredients = new ArrayList<>();

			// read ingredients
			while (((line = reader.readLine()) != null) && (!line.trim().isEmpty())) {
				ingredients.add(line.trim());
			}

			recipes.add(new Recipe(name, cookingTime, ingredients));
		}

		reader.close();
		return recipes;
	}
}
