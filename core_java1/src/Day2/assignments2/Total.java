package Day2.assignments2;

public class Total {

	public static void main(String[] args) {
		int[] marks = {69,85,66,80,81};
		int sum =0;
		for(int i=0;i<marks.length;i++) {
			sum = sum + marks[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Avergae : "+(sum/marks.length));

	}

}
