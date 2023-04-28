package oops_again.abstract_class;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("get the utensils");
		System.out.println("switch on the microwave");
		
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		
	}

	@Override
	void cleanUp() {
		System.out.println("clean up the utensils");
		System.out.println("switch off the microwave");
		
	}

}
