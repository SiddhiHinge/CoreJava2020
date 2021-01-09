package Day3.ScannerExample;
import java.util.Scanner;;

public class Eg1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		String surname;
		int roll;
		double percent;
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		//System.out.println("Your name is "+name);
		
		System.out.println("Enter Surname : ");
		surname = sc.nextLine();
		//System.out.println("Your surname is "+surname);
		
		System.out.println("Enter Roll : ");
		roll = sc.nextInt();
		//System.out.println("Your Roll No is "+roll);
		
		System.out.println("Enter percentage : ");
		percent = sc.nextDouble();
		//System.out.println("Your percentage is "+percent);
		
		System.out.println("Your name is "+name);
		System.out.println("Your surname is "+surname);
		System.out.println("Your Roll No is "+roll);
		System.out.println("Your percentage is "+percent);
	}
	
	/* if we use sc.next() the o/p is 
	Enter Name : 
	Siddhi Hinge
	Your name is Siddhi*/

}
