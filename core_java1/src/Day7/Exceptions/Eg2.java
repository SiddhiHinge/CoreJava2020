package Day7.Exceptions;

public class Eg2 {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		try {
			System.out.println("Element 2 : "+numbers[1]);
		}
		catch(Exception e){
			System.out.println("Something went Wrong!");
		}
		finally {
			for(int n:numbers) {
				System.out.println(n);
			}
			System.out.println("Finally block Excecuted !");
		}
	}
	
}
