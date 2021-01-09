package Day2.arrays;

public class Eg4 {

	public static void main(String[] args) {
		//Updating existing array values
		System.out.println("Before updating !");
		String[] names = {"Hary","Ron","Draco"};
		for (String x:names) {
			System.out.println(x);
		}
		names[0] = "Harry";
		System.out.println("After updating !");
		for (String x:names) {
			System.out.println(x);
		}

	}

}
