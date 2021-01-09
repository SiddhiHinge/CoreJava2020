package Day2.methods;

public class Eg3 {
	public static void main(String[] args) {
		int ans1 = add(30,50);
		int ans2 = substract(40,10);
		System.out.println("Addition : "+ans1);
		System.out.println("Substraction : "+ans2);
	}
	public static int add(int x,int y) {
		int ans = x+y;
		return ans;
	}
	
	public static int substract(int x,int y) {
		int ans = x-y;
		return ans;
	}
}
