package Day1.assignments1;

public class Example5 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int i,j;
		if((i = x++) != x) {
			System.out.println("Post increment of x=5:"+i);
			//in this value is increased but not stored to var i
		}
		if((i = x++) != x) {
			System.out.println("Pre increment x=5:"+i);
			//in this value is increased same time stored to var i
		}
		System.out.println(y++);
		System.out.println(++y);
	}

}
