package Day5.SetEg.BeanForSet;
import java.util.*;
import Day3.Beans.Student;

public class SetBean {

	public static void main(String[] args) {

		Set<Student> studentsSet = new HashSet<Student>();
		Student s1 = new Student(101,"Siddhi","BE");
		Student s2= new Student(102,"Revati","BCOM");
		Student s3 = new Student(103,"Sumedha","MBBS");
		Student s4 = new Student(104,"Vaishnavi","HR");
		studentsSet.add(s1);
		studentsSet.add(s2);
		studentsSet.add(s3);
		studentsSet.add(s4);
		
		Iterator<Student> itr = studentsSet.iterator();
		System.out.println("Printing Student Set using - While Iterator Loop");
		while(itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------");
		
		System.out.println("\nPrinting Student Set using - For Each Loop");
		for(Student s : studentsSet) {
			System.out.println(s);
		}
	}

}
