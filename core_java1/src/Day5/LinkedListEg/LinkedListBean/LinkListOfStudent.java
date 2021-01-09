package Day5.LinkedListEg.LinkedListBean;

import java.util.LinkedList;
import Day3.Beans.*;

//Java has an interface called List
//ArrayList and LinkedList both implement the List interface

public class LinkListOfStudent {

	public static void main(String[] args) {
		
		LinkedList<Student> studentsList = new LinkedList<Student>();
		Student s1 = new Student(11,"Siddhi","BE");
		Student s2 = new Student(12,"Revati","BSC");
		Student s3 = new Student(13,"Sumedha","CA");
		Student s4 = new Student(14,"Vaishnavi","MBBS");
		
		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		
		System.out.println(studentsList);

	}

}
