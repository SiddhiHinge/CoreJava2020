package Day4.interfacesEg;

public class Dog implements Animal{

	@Override
	public void sleep() {
		System.out.println("Animal Sleep : Zzz Zzz");
		
	}

	@Override
	public void animalSound() {
		System.out.println("Dog : Boo Woo");
		
	}

	
}
