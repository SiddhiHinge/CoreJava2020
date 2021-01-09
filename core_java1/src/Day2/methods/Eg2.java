package Day2.methods;

public class Eg2 {
	public static void main(String[] args) {
		add(30,50);
		substract(40,10);
	}
	public static void add(int x,int y) {
		int ans = x+y;
		System.out.println("Addition : "+ans);
	}
	
	public static void substract(int x,int y) {
		int ans = x-y;
		System.out.println("Substraction : "+ans);
	}
}
