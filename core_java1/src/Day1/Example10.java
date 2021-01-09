package Day1;

public class Example10 {

	public static void main(String[] args) {
		int x=3;
		System.out.println("Post inccrement");
		int i = x++;
		System.out.println("x and i : "+x+" "+i);
		System.out.println("Pre increment");
		i = ++x;
		System.out.println("x and i : "+x+" "+i);
	}

}
