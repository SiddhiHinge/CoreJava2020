package Day1.switchs;

public class Eg2 {

	public static void main(String[] args) {
		int age = 55;
		int category;
		if(age>50) {
			category=1;
		}
		else {
			category=2;
		}
		switch (category) {
		  case 1:
		    System.out.println("Senior Citizen");
		    break;
		  case 2:
		    System.out.println("Not Senior Citizen");
		    break;
		}

	}

}
