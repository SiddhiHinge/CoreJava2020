package Day1.assignments1;

public class Example4 {

	public static void main(String[] args) {
		
		// Wide Casting
		
		char a = '1';
		int b = a;
		System.out.println("Char '1' to Int:"+b); //O/p Ascii value of i
		System.out.println("Char '1' to Int:"+Character.getNumericValue(b));
		// o/p is 1
		float x = 3.567f;
		double y = x;
		System.out.println("Float 3.567f to Double:"+y); //3.566999912261963
		
		//Narrow Casting
		double m = 78.98;
		float n = (float) m;
		System.out.println("Double 78.98 to float:"+n); //78.98
		
		int u = 97;
		char v = (char) u;
		System.out.println("Int 97 to char:"+v); //o/p : a
		
	}

}
