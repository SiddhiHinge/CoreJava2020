package Day2.breakContinue;

public class Eg3 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			if(i == 2) {
				break;
			}
			System.out.println(i);
			i++;
		}
		i = 0;
		while (i <= 5) {
			if(i == 2) {
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
