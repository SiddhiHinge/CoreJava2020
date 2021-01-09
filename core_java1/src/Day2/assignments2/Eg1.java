package Day2.assignments2;

public class Eg1 {
	
	public int[] getNumbers() {
		int[] numbers = {2,3,4,5};
		return  numbers;
	}
	
	public int[] getNumbersSqr(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i]*numbers[i];
		}
		return numbers;
	}
	
	public void display(int[] numbers) {
		for (int n:numbers) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		int [] numbers;
		numbers = eg1.getNumbers();
		System.out.println("Displaying the numbers !");
		eg1.display(numbers);
		numbers = eg1.getNumbersSqr(numbers);
		System.out.println("Displaying the square of numbers !");
		eg1.display(numbers);
	}

}
