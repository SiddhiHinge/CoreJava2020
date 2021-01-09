package Day5.abstraction.Example2;

public class TestMultiInheritance implements Calculator , Maths{

	public static void main(String[] args) {
		TestMultiInheritance t = new TestMultiInheritance();
		t.add(20,5);
		t.substract(20,5);
	}
	@Override
	public void add(int x, int y) {
		int ans = x + y;
		System.out.println("Addition : "+ans);
	}

	@Override
	public void substract(int x, int y) {
		int ans = x - y;
		System.out.println("Substraction : "+ans);
	}

}
