package Day9.jdbc;

import BeansClass.Student;

public class TestStudent {

	public static void main(String[] args) {
		//
		StudentDao dao = new StudentDao();
		//dao.deleteStudent(125);
		//dao.viewStudent();
		Student s1 = new Student(124,"Rubeus Hagrid","NodeJs",60,25);
		dao.updateStudentAge(s1);
		dao.viewStudent();
	}

}
