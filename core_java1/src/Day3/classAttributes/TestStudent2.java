package Day3.classAttributes;
import Day3.Beans.*;
public class TestStudent2 {

	public static void main(String[] args) {
		
		Student student1 = new Student(10, "Draco", "BE");
		Student student2 = new Student(20, "Harry", "MTECH");
		Student student3 = new Student(30, "Ron", "MBS");
		Student student4 = new Student(40, "Stark", "BSC");
		Student[] allStudents = {student1 , student2 , student3, student4};
		TestStudent2 arrayOfStudent = new TestStudent2();
		arrayOfStudent.displayAllStudents(allStudents);
	}
	
	public void displayAllStudents(Student[] allStudents) {
		for (Student stud:allStudents) {
			System.out.println(stud);
		}
	}

}
