package oops_again.abstract_class;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materials");
		System.out.println("get the utensils");
		
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		
	}

	@Override
	void cleanUp() {
		System.out.println("clean up the utensils");
		
	}

}
