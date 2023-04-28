package oops_again.abstract_class;

public class AnimalRunner {

	public static void main(String[] args) {
		abstractAnimal[] animals = { new Cat() , new Dog() };
		for(abstractAnimal animal : animals) {
			animal.bark();
		}			
}
}

