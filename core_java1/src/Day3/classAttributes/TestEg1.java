package Day3.classAttributes;

public class TestEg1 {

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		System.out.println("Employee Name : "+eg1.empName);
		System.out.println("Employee Number : "+eg1.empNo);
	}

	//if we dont initialize the values of class attributes 
	//then we will get its default value
	//Employee Name : null , Employee No : 0
}
