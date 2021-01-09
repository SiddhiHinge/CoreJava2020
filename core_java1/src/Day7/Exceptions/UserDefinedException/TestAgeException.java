package Day7.Exceptions.UserDefinedException;

public class TestAgeException {

	public static void checkAge(int age) throws AgeNotValidException {
		if (age < 18) {
			throw new AgeNotValidException("Access Denied !");
		}
		else {
			System.out.println("Access Accepted !");
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("When age is 9 yrs ");
			checkAge(9);
		}
		catch(AgeNotValidException e) {
			//System.out.println(e);
			//e.printStackTrace();
		}
	}

}

/*
Output:
When age is 9 yrs 
Age must be more than 18 !
Access Denied !
*/
