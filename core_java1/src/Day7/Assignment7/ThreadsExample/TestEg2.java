package Day7.Assignment7.ThreadsExample;

public class TestEg2 {

	public static void main(String[] args) {
		Eg2 eg2 = new Eg2();
		Thread thread = new Thread(eg2);
		thread.start();

	}

}
