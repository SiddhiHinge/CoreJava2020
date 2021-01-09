package Day9.Assignment9.Example1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestAtm extends AtmMachine {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter Username : ");
		String username = sc.nextLine();
		TestAtm atm = new TestAtm();
		atm.showDetails(username);
		atm.showAtmDeatils();
		System.out.println("Do you want to Tansfer Money (Yes/No) ?");
		String ans1 = sc.next();
		if(ans1.equalsIgnoreCase("Yes")) {
			atm.moneyTransfer();
		}
		System.out.println("Do you want to withdraw Cash (Yes/No) ?");
		String ans2 = sc.next();
		if(ans2.equalsIgnoreCase("Yes")) {
			atm.cashWithdraw();
		}
		System.out.println("Thank You For Visiting !");
	}

	@Override
	public void moneyTransfer() {
		
		System.out.println("Money Transfered succesfully !");
		
	}

	@Override
	public void cashWithdraw() {
		
		System.out.println("Cash Withdraw succesful !");

	}

	@Override
	public void showAtmDeatils() {
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm");
		String dateTime = localDateTime.format(dateTimeFormatter);
		System.out.println("Date and Time : "+dateTime);
	}

}
