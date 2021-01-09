package Day2.methods;

public class Eg6 {
// giving array as parameters to method
	
	public void displayNames(String names[]) {
		for (String n:names) {
			System.out.println(n);
		}
	}
	
	public String[] getnames() {
		String[] studNames = {"Harry","Ron","Draco","John"};
		return studNames;
	}
}
