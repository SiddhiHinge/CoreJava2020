package Day1.strings;

public class Example9 {

	public static void main(String[] args) {
	String str1 = new String("okay");
	String str2 = new String(str1);
	System.out.println(str1==str2);
	String s1 = "Harry";
	System.out.println(s1.indexOf('t'));
	//gives o/p -1
	
	/*String s2 = null;
	if(s2.length()==0) {
		System.out.println("1");
	}
	else if(s2 == null) {
		System.out.println("2");
	}
	else {
		System.out.println("3");
	}
	
*/ 
		//this gives java.lang.NullPointerException
	}
}
