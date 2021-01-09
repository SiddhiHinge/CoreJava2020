package Day8.Assignment8;

import java.sql.*;
import BeansClass.Student;
import Utility.DbUtil;

public class Eg7 {

	public static void main(String[] args) {
		
		//Student s1 = new Student(125,"Severus Snape","Testing",30,23);
		Eg7 eg7 = new Eg7();
		//eg7.addStudent(s1);
		eg7.viewStudent();
	}
	
	public void addStudent(Student s) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "insert into student values (?,?,?,?,?)";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1, s.getRollNo());
			pst.setString(2, s.getName());
			pst.setString(3, s.getCourse());
			pst.setInt(4, s.getDuration());
			pst.setInt(5, s.getAge());
			int result = pst.executeUpdate();
			if(result > 0) {
				System.out.println("Inserted succesfully !");
			}
			else {
				System.out.println("Not Inserted !");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void viewStudent() {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "select * from student";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				
				int dbRollNo = rs.getInt(1);
				String dbName = rs.getString(2);
				String dbCourse = rs.getString(3);
				int dbDuration = rs.getInt(4);
				int dbAge = rs.getInt(5);
				
				Student s = new Student(dbRollNo, dbName, dbCourse, dbDuration, dbAge);
				
				System.out.println(s);
				System.out.println("-----------------------------------------");
				
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
