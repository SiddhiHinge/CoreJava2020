package Day2.assignments2;

public class Eg2 {

	public static void main(String[] args) {
		
		int number;
		int[] oddNum = new int[10];
		int[] evenNum = new int[10];
		for (int i = 0; i < 10 ; i++) {
			number = (int) (Math.random()*11);
			
			if(number == 0) {
				continue;
			}
			else {
				System.out.println("Number : "+number);
				if((number % 2) != 0) {
					oddNum[i] = number;
				}
				else {
					evenNum[i] = number;
				}
			}
		}
		System.out.println("Odd numbers !");
		for (int n:oddNum) {
			if(n == 0) {
				continue;
			}
			System.out.println(n);
		}
		System.out.println("Even numbers !");
		for (int n:evenNum) {
			if(n == 0) {
				continue;
			}
			System.out.println(n);
		}
	}

}
