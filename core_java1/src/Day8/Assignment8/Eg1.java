package Day8.Assignment8;

import java.sql.*;

public class Eg1 {

	public static void main(String[] args) {
		
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUsername = "root";
		String dbPassword = "Mysql30";
		
		try {
			Class.forName(driverClassName);
			Connection connect = DriverManager.getConnection(url, dbUsername, dbPassword);
			Statement st = connect.createStatement();
			String query = "select * from student";
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				int dbRollNo = rs.getInt(1);
				String dbName = rs.getString(2);
				String dbCourse = rs.getString(3);
				int dbDuration = rs.getInt(4);
				int dbAge = rs.getInt(5);
				System.out.println("RollNo : "+dbRollNo);
				System.out.println("Name : "+dbName);
				System.out.println("Course : "+dbCourse);
				System.out.println("Duration : "+dbDuration+" days");
				System.out.println("Age : "+dbAge+" yrs");
			}
		} 
		catch (Exception e) {
			System.out.println("Error = "+e.getMessage());
		}
		

	}

}
