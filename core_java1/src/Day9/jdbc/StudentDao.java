package Day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import BeansClass.Student;
import Utility.DbUtil;

public class StudentDao {

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
	
	public void deleteStudent(int rollNo) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "delete from student where RollNo = ?";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1, rollNo);
			int rs = pst.executeUpdate();
			if(rs > 0) {
				System.out.println("Student deleted successfully !");
			}
			else {
				System.out.println("Student not deleted !");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudentAge (Student s) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "update student set Age = ? where RollNo = ?";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1, s.getAge());
			pst.setInt(2, s.getRollNo());
			int rs = pst.executeUpdate();
			if(rs > 0) {
				System.out.println("Student Age updated !");
			}
			else {
				System.out.println("Student Age not updated !");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
