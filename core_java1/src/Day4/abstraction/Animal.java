package Day4.abstraction;

public abstract class Animal {
	
	//Even if a class has 1 abstract method then the class should also be abstract
	
	public abstract void animalSound();
	
	/* public void animalSound(); Gives error
	- This method requires a body instead of a semicolon
	- The abstract method animalSound in type Animal can only be defined by an 
	 abstract class
	 */

	public void sleep() {
		System.out.println("Animal Sleeps : Zzz Zzz");
	}
}
