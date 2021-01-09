package Day7.Exceptions;

public class Eg3 {

	public static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access Denied !");
		}
		else {
			System.out.println("Access Accepted !");
		}
	}
	public static void main(String[] args) {
		System.out.println("When age is 19 yrs ");
		checkAge(19);
		//Access Accepted !
		
		System.out.println("When age is 9 yrs ");
		checkAge(9);
		//java.lang.ArithmeticException: Access Denied !
	}

}
