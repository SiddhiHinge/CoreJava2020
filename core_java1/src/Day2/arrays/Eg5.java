package Day2.arrays;

public class Eg5 {

	public static void main(String[] args) {
		int[][] numSqr = {{2,3,4},{4,9,16}};
		System.out.println(numSqr[0]);
		System.out.println(numSqr[1]);//Gives address of single array
		
		int[] num = numSqr[0];
		int[] sqr = numSqr[1];
		System.out.println("Printing the numbers !");
		for(int n:num) {
			System.out.println(n);
		}
		System.out.println("Printing the Squares of numbers !");
		for(int s:sqr) {
			System.out.println(s);
		}
		
		System.out.println("Square of "+num[0]+" is "+sqr[0]);
		System.out.println(numSqr[1][2]);
		
	}

}
