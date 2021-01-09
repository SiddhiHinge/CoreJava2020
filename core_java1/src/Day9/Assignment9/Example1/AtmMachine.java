package Day9.Assignment9.Example1;

public abstract class AtmMachine implements AtmOperations{

	public void showDetails(String username) {
		
		System.out.println("Welcome "+username+" How can I help you ?");
	}
	
	public abstract void showAtmDeatils();
}
