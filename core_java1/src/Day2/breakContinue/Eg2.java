package Day2.breakContinue;

public class Eg2 {
	
	// continue 

	public static void main(String[] args) {
		for(int i=0 ; i <=5 ;i++) {
			if(i==3) {
				System.out.println("Hello");
				continue;
			}
			System.out.println(i);
		}
	}

}
