package Day8.Assignment8;

import java.sql.*;
import Utility.DbUtil;

public class Eg5 {

	public static void main(String[] args) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "select * from student where RollNo = ?";
		int rollNo = 124;
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
				
				if(rollNo == dbRollNo) {
					System.out.println("Displaying student details : ");
					System.out.println("RollNo : "+dbRollNo);
					System.out.println("Name : "+dbName);
					System.out.println("Course : "+dbCourse);
					System.out.println("Duration : "+dbDuration+" days");
					System.out.println("Age : "+dbAge+" yrs");
				}
			}
			else {
				System.out.println("Student not found !");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
