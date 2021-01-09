package Day3.Assignments3;

import java.util.Scanner;

public class TestBankAccount {

	public static void main(String[] args) {

		bankAccount account = null;
		int option;
		System.out.println("1. Create Account");
		System.out.println("2. Update Amount");
		System.out.println("3. Show Account Details");
		System.out.println("4. Exit");
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter your choice : ");
			option = sc.nextInt();

			if (option == 1) {
				Scanner s = new Scanner(System.in);
				String s1, s2;
				double amt;

				System.out.println("Enter Account Name : ");
				s1 = s.nextLine();

				System.out.println("Enter Amount : ");
				amt = s.nextDouble();

				System.out.println("Enter Account Type : ");
				s2 = s.next();

				account = new bankAccount(s1, s2, amt);
			} else if (option == 2) {
				System.out.println("Your last updated Amount is : " + account.getAmount());
				System.out.println("Enter New Amount : ");
				account.setAmount(sc.nextDouble());
				System.out.println(account);
			} else if (option == 3) {
				System.out.println(account);
			} else if (option == 4) {
				System.out.println("Thank You ! Bye");
			} else {
				System.out.println("Enter correct option !");
			}

		} while (option != 4);
	}

}
