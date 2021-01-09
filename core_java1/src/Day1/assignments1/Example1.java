package Day1.assignments1;

public class Example1 {
	
	/*Variable y is accessed out of its scope. 
	Since the variable y is declared inside if block ,
	so its scope is limited to the if block only. 
	Outside if block variable y is unknown, so it will lead to an error.*/

	public static void main(String[] args) {
		int x= 10;
		if(x==10) {
			int y=20;
			System.out.println("x and y:"+x+" "+y);
			y = x * 20;
		}
//		y = 100;
//		System.out.println("x and y:"+x+" "+y);
	}

}
