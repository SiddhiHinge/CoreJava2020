package Day7.Exceptions.UserDefinedException;

public class AgeNotValidException extends Exception{

	public AgeNotValidException() {
		System.out.println("Age must be more than 18 !");
	}
	
	public AgeNotValidException(String msg) {
		this();
		System.out.println(msg);
	}
	
}
