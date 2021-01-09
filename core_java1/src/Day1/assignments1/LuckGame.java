package Day1.assignments1;

public class LuckGame {

	public static void main(String[] args) {
		int luckyNo = (int) (Math.random() * 11);
		System.out.println("May the luckiest Win !!");
		switch(luckyNo) {
		
		case 10:
			System.out.println("Your Lucky Number is "+luckyNo);
			System.out.println("Congratulation,You are the 3rd Luckiest person !");
			break;
		case 1:
			System.out.println("Your Lucky Number is "+luckyNo);
			System.out.println("Congratulation,You are the 2nd Luckiest person !");
			break;
		case 7:
			System.out.println("Your Lucky Number is "+luckyNo);
			System.out.println("Congratulation,You are the 1st Luckiest person !");
			break;
		default:
			System.out.println("Your Lucky Number is "+luckyNo);
			System.out.println("Better Luck Next Time :) ");
		}
			

	}

}
