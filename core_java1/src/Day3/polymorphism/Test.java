package Day3.polymorphism;

public class Test {

	//Method overriding polymorphism or runtime/execution polymorphism
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalSound(); //Animal makes sound !
		
		Dog dog = new Dog();
		dog.animalSound(); //Dog makes BooBoo sound !
		
		Animal pig = new Pig();
		pig.animalSound(); //Pig makes WeeWee sound !

	}

}
