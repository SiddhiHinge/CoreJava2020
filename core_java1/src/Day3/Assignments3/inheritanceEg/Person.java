package Day3.Assignments3.inheritanceEg;

public class Person {

	protected String name;
	
	public Person() {
		System.out.println("Every person has a name.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
