package Day2.methods;

public class TestEg5 {

	//We will get error bcoz we have declared the method as static 
	// And to use static method we need to mention class name
	public static void main(String[] args) {
			int ans1 = Eg5.add(30,50);
			int ans2 = Eg5.substract(40,10);
			int ans3 = Eg5.multiply(4,2);
			int ans4 = Eg5.substract(16,2);
			System.out.println("Addition : "+ans1);
			System.out.println("Substraction : "+ans2);
		}

}
