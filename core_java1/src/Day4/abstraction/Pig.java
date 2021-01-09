package Day4.abstraction;

public class Pig extends Animal{

	@Override
	public void animalSound() {
		
		System.out.println("Pig says : Wee Wee");
	}
	
	//If we only write this - public class Pig extends Animal{}
	//The type Pig must implement the inherited abstract method Animal.animalSound()

}
