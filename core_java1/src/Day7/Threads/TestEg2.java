package Day7.Threads;

public class TestEg2 {

	public static void main(String[] args) {
		
		Eg2 eg2 = new Eg2();
		Thread thread1 = new Thread(eg2);
		thread1.start();

	}

}
