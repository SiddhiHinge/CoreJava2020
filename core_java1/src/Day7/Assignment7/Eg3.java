package Day7.Assignment7;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int num1,num2;
		try {
			System.out.println("Enter the dividend and divisor : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			double ans = num1/num2;
			System.out.println("Quotient is "+ans);
		}
		catch(ArithmeticException e) {
			System.out.println("Error = "+e.getMessage());
			System.out.println("Divisor should not be 0");
		}

	}

}
