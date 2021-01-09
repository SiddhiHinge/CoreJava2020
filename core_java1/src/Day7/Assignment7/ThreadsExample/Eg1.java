package Day7.Assignment7.ThreadsExample;

public class Eg1 extends Thread{
	
	public void run() {
		System.out.println("Now in run() method of class Eg1..");
		add(10,10);
	}
	
	public static void add (int a,int b) {
		System.out.println("add(a,b) method called in run..Now excecuted");
		System.out.println("Addition is "+(a+b));
	}

}
