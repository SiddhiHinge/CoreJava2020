package Day3.Assignments3.inheritanceEg;

public class Employee extends Person {
	private int empId;
	
	public Employee() {
		System.out.println("Every employee has a Employee Id.");
	}
	public Employee (int empId,String name) {
		this();
		this.empId = empId;
		this.setName(name);
		System.out.println("Every employee is a person.");
	}
	@Override
	public String toString() {
		return "Employee Id = " + empId + "\nEmployee Name = " + name;
	}
	
}
