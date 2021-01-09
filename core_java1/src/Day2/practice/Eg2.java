package Day2.practice;

public class Eg2 {

	public static void main(String[] args) {
		String[] mobile = {"Apple","Samsung","Oneplus"};
		int[] cost = {50000,27000,30000};
		System.out.println("Displaying popular mobile phones !");
		for (String m:mobile) {
			System.out.println("Mobile:"+m);
		}
		System.out.println("Displaying cost of mobile phones !");
		for (int c:cost) {
			System.out.println("Cost:"+c);
		}
	}

}
