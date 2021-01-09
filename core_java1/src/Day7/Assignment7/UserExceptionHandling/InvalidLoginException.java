package Day7.Assignment7.UserExceptionHandling;

public class InvalidLoginException extends Exception{

	public InvalidLoginException() {
		System.out.println("Invalid Login Credentials ! ");
	}
}
