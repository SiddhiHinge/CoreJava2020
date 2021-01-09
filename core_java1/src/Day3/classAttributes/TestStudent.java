package Day3.classAttributes;
import Day3.Beans.*;
public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student(10, "Draco", "BE");
		System.out.println(student1);
		
		Student student2 = new Student(20, "Harry", "MTECH");
		System.out.println(student2);
		
		Student student3 = new Student(30, "Ron", "MBS");
		System.out.println(student3);
		
		Student student4 = new Student(40, "Stark", "BSC");
		System.out.println(student4);
	}

}
