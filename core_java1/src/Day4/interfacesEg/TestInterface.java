package Day4.interfacesEg;

public class TestInterface {

	public static void main(String[] args) {

		Dog dog = new Dog();
		System.out.println("Animals are "+Dog.s1);
		dog.animalSound();
		dog.sleep();
		
		
		//System.out.println("Animals are "+dog.s1); - gives warning that
		//The static field Animal.s1 should be accessed in a static way
	}

}
