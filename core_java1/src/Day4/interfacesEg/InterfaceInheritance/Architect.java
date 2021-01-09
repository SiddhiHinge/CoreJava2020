package Day4.interfacesEg.InterfaceInheritance;

public class Architect extends Human implements Artist,MathsGenius{

	public static void main(String[] args) {
		
		Architect architect = new Architect();
		architect.aboutHuman();
		architect.calculate();
		architect.draw();

	}

	@Override
	public void calculate() {
		System.out.println("Architect is a Maths Genius");
		
	}

	@Override
	public void draw() {
		System.out.println("Architect is a Artist");
		
	}

}
