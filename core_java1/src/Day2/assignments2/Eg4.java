package Day2.assignments2;

public class Eg4 {

	public static void main(String[] args) {
		int[] salary = {20000,55000,70000,60000};
		for(int i=0;i<salary.length;i++) {
			if(salary[i]==55000) {
				System.out.println("Found !");
				break;
			}
			else {
				if (i==(salary.length-1)) {
					System.out.println("Not Found !");
				}
				
			}
		}

	}

}
