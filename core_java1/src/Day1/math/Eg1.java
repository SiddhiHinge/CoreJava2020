package Day1.math;

public class Eg1 {

	public static void main(String[] args) {
		System.out.println(Math.max(10,13));
		System.out.println(Math.min(10,13));
		System.out.println(Math.min(10.9,1));
		System.out.println(Math.sqrt(64.0));
		System.out.println(Math.abs(-64.89));
		System.out.println(Math.random());
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
		randomNum = (int)(Math.random() * 11); // 0 to 10
		System.out.println(randomNum);
		//Math.min or Math.max always returns int value
		// Math.sqrt always takes double and also returns double
		// Math.abs takes all types of values and returns same type of value
		//Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
	}

}
