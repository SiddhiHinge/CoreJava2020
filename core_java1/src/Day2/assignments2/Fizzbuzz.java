package Day2.assignments2;

public class Fizzbuzz {

	public static void main(String[] args) {
		int number = 1;
		while(number <= 20) {
			
			if((number % 3 == 0)&&(number % 5!=0)) {
				System.out.println("Fizz");
			}
			else if ((number % 3 != 0)&&(number % 5 == 0)){
				System.out.println("Buzz");
			}
			else if ((number % 3==0)&&(number % 5==0)) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(number);
			}
			number++;
		}

	}

}
