package Day7.Assignment7.UserExceptionHandling;

import java.util.Scanner;

public class TestLoginDetails {
	
	public static void checkLogin(String uname,String pass) throws InvalidLoginException{
		LoginDetails login = new LoginDetails();
		boolean ans1 = login.getUsername().equals(uname);
		boolean ans2 = login.getPassword().equals(pass);
		
		if(!(ans1&&ans2)) {
			throw new InvalidLoginException();
		}
		else {
			System.out.println("Login Successfull !");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uname,pass;
		try {
			System.out.println("Enter Username : ");
			uname = sc.next();
			System.out.println("Enter Password : ");
			pass = sc.next();
			checkLogin(uname, pass);
		}
		catch(InvalidLoginException e) {
			System.out.println("Login Unsuccessful !");
		}

	}

}
