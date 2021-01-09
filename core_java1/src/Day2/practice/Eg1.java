package Day2.practice;

public class Eg1 {

	public static void main(String[] args) {
		String[] mobile = {"Apple","Samsung","Oneplus"};
		int[] cost = {50000,27000,30000};
		System.out.println("Displaying cost of popular mobile phones !");
		for (int i=0;i<mobile.length;i++) {
			System.out.println("Mobile : "+mobile[i]+", Cost : "+cost[i]);
		}
	}

}
