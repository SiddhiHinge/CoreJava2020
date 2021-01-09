package Day8.Assignment8;

import java.sql.*;
import Utility.DbUtil;

public class Eg2 {

	public static void main(String[] args) {
		
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
				System.out.println("RollNo : "+dbRollNo);
				System.out.println("Name : "+dbName);
				System.out.println("Course : "+dbCourse);
				System.out.println("Duration : "+dbDuration+" days");
				System.out.println("Age : "+dbAge+" yrs");
				System.out.println("-----------------------------------------------");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
