package Day2.methods;

public class Eg7 {
	//method overloading - same method name but diffrent no. of arguments
	public static int add(int x,int y) {
		int ans = x+y;
		return ans;
	}
	
	public static int add(int x,int y,int z) {
		int ans = x+y+x;
		return ans;
	}
	
}
