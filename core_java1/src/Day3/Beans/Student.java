package Day3.Beans;

public class Student {

	private int rollNo;
	private String studName;
	private String course;
	
	public Student() {}
	
	public Student(int rollNo, String studName, String course) {
		super();
		this.rollNo = rollNo;
		this.studName = studName;
		this.course = course;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "RollNo =" + rollNo + ", Name =" + studName + ", Course=" + course;
	}
	
	
}
