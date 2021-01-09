package Day4.UserInputs;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 persons names - ");
		String[] names = new String[3];
		for(int i=0;i<3;i++) {
			names[i] = sc.next();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Name "+(i+1)+" : "+names[i]);
		}
	    System.out.println("Enter name, age and salary:");
	    String name = sc.nextLine();
	    int age = sc.nextInt();
	    double salary = sc.nextDouble();
	    System.out.println("Name: " + name);
	    System.out.println("Age: " + age);
	    System.out.println("Salary: " + salary);
	}

}
