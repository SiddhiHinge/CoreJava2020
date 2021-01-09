package Day3.classAttributes;

public class Employee {

	private String empName;
	private int empNo;
	
	public Employee() {
		
	}
	public Employee(String empName, int empNo) {
		this.empName = empName;
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "Name = " + empName + ", EmpNo = " + empNo;
	}
	
}
