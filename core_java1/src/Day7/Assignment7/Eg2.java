package Day7.Assignment7;

public class Eg2 {

	public static void main(String[] args) {
		String[] animals = null;
		try {
			System.out.println("Printing number of animals : ");
			System.out.println(animals.length);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("You need to add names of animals !");
		}
		finally {
			System.out.println("Finally block excecuted !");
		}

	}

}
