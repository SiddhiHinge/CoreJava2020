package Day4.interfacesEg;

public interface Animal {
	
	String s1 = "Cute";
	//variables declared inside an interface are by default static and final
	public void sleep();
	public void animalSound();

	//we can have body to method in interface using default modifier
}
