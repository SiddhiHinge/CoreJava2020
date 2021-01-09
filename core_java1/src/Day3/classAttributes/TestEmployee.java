package Day3.classAttributes;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Number : "+employee.getEmpNo());
		System.out.println("Updating employee objects !");
		employee.setEmpName("Harry");
		employee.setEmpNo(1928);
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Number : "+employee.getEmpNo());
		System.out.println("Parameterized constructor employee objects !");
		Employee employee1 = new Employee("Ron",2356);
		System.out.println("Employee Name : "+employee1.getEmpName());
		System.out.println("Employee Number : "+employee1.getEmpNo());
		if (true){
			System.out.println(employee1);
		}
		
	}

}
