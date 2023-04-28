package oops_again.abstract_class;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		RecipeWithMicrowave recipeWithMicrowave = new RecipeWithMicrowave();
		recipe.execute();
		recipeWithMicrowave.execute();

	}

}
