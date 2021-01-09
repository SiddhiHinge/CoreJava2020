package Day1.assignments1;

public class FindAgeGame {

	public static void main(String[] args) {
		int luckyNo = 8;
		int num1 = luckyNo*2;
		int num2 = num1 + 5;
		int num3 = num2 * 50;
		char hadYourBirthday = 'N';
		int birthYr = 1998;
		int answer;
		
		System.out.println("Let Start !");
		System.out.println("Your lucky number"+"["+luckyNo+"]"+" X 2 : "+num1);
		System.out.println(num1+" + 5 : "+num2);
		System.out.println(num2+" X 50 : "+num3);
		
		if (hadYourBirthday == 'Y') {
			answer = num3+1770-birthYr;
			System.out.println(num3+" + 1770 - Birth Year : "+answer);
			System.out.println("First Digit is your Lucky number & last two digits is Age : "+answer);
		}
		else if (hadYourBirthday == 'N') {
			answer = num3+1769-birthYr;
			System.out.println(num3+" + 1769 - Birth Year : "+answer);
			System.out.println("First Digit is your Lucky number & last two digits is Age : "+answer);
		}
		
	}

}
