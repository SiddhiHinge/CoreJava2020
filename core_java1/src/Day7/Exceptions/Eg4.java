package Day7.Exceptions;

public class Eg4 {

	/*whenever you add "throws" declaration to a method, 
	 * you are actually deferring the responsibility of 
	 * handling the possible exception to the caller of that method
	 */
	
	public static void checkAge(int age) throws Exception {
		if (age < 18) {
			throw new Exception("Access Denied ! Age must be 18 yrs ");
		}
		else {
			System.out.println("Access Accepted !");
		}
	}
	public static void main(String[] args) {
		//In main method we should not use Throws
		
		try {
			System.out.println("When Age is 9 yrs : ");
			checkAge(9);
		}
		catch(Exception e) {
			System.out.println("Something went wrong ! "+e.getMessage());
		}

	}

}
