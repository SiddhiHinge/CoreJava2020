package Day7.Assignment7.ThreadsExample;

public class Eg2 implements Runnable{

	@Override
	public void run() {
		System.out.println("In the run() method of class Eg2..");
		System.out.println("Now calling substract(a,b) method from run()");
		substract(10,5);
	}

	private void substract(int i, int j) {
		
		System.out.println("Now excecuting..");
		System.out.println("Substraction is "+(i-j));
		
	}
	

}
