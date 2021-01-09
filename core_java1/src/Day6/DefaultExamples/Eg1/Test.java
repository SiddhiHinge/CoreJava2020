package Day6.DefaultExamples.Eg1;

public class Test implements Calculator {

	public static void main(String[] args) {
		Test t = new Test();
		t.add();
		t.show();
		/*Implementing interface in main method
		int ans1 = t.add(5,5);
		System.out.println("Addition by Calculator : "+ans1);
		int ans2 = t.add(10,10);
		System.out.println("Addition by Maths : "+ans1);
		*/
	}
	public void add() {
		int ans1 = Calculator.super.add(5,5);
		System.out.println("Addition by Calculator : "+ans1);
	}
}
