package Day4.Assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import Day3.Beans.Student;

public class ArrayListOfStudent {

	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);
	static Scanner s3 = new Scanner(System.in);
	
	public static void main(String[] args) {

		ArrayList<Student> studentsArray = new ArrayList<Student>();
		String ans = "Y";
		
		while(ans.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter Student Roll No , Name , Course : ");
			Student s = new Student(s1.nextInt(),s2.nextLine(),s3.next());
			studentsArray.add(s);
			System.out.println("Do you want to enter new student : ");
			ans = s3.next();
		}
		
		Iterator<Student> itr = studentsArray.iterator();
		
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println("Student RollNo : "+s.getRollNo());
			System.out.println("Student Name : "+s.getStudName());
			System.out.println("Student Course : "+s.getCourse());
			System.out.println("---------------------------------------------");
		}

		
	}

}
