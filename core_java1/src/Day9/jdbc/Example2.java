package Day9.jdbc;

import java.sql.*;
import java.util.*;
import BeansClass.Student;
import Utility.DbUtil;

public class Example2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Student s1 = new Student(125,"Severus Snape","Testing",30,23);
		int rollNo;
		String name;
		Example2 example2 = new Example2();
		//example2.addStudent(s1);
		//example2.viewStudent();
		
		/*
		System.out.println("Enter Student Roll No : ");
		rollNo = sc.nextInt();
		example2.getStudentByRoll(rollNo);
		 */
		
		System.out.println("Enter Student Name : ");
		name = sc.nextLine();
		example2.getStudentByName(name);
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
	
	public void getStudentByRoll(int rollNo) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "select * from student where RollNo = ?";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1, rollNo);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int dbRollNo = rs.getInt(1);
				String dbName = rs.getString(2);
				String dbCourse = rs.getString(3);
				int dbDuration = rs.getInt(4);
				int dbAge = rs.getInt(5);
				
				Student s = new Student(dbRollNo,dbName,dbCourse,dbDuration,dbAge);
				System.out.println(s);
			}
			else {
				System.out.println("Student not found !");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getStudentByName(String name){
		String query = "select * from student where Name like ?";
		Connection connect = DbUtil.getMysqlDbConnection();
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			//pst.setString(1, name);
			pst.setString(1, "%" + name + "%");
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int dbRollNo = rs.getInt(1);
				String dbName = rs.getString(2);
				String dbCourse = rs.getString(3);
				int dbDuration = rs.getInt(4);
				int dbAge = rs.getInt(5);
				
				Student s = new Student(dbRollNo,dbName,dbCourse,dbDuration,dbAge);
				
				System.out.println(s);
				
			}
			else {
				System.out.println("Student with that name not found !");
			}
		}
		catch(Exception e) {
			System.out.println("Error : "+e.getMessage());
		}
	}

}
