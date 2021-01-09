package Day4.abstraction;

public class TestAbstraction {

	public static void main(String[] args) {
		
		/*Animal animal = new Animal();
		Gives Error - Cannot instantiate the type Animal
		Bcoz we cannot create obj of abstract class*/

		Animal animal = new Pig();
		animal.animalSound();
		animal.sleep();
	}

}
