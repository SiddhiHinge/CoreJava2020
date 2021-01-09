package Day8.jdbcPractice;

import java.sql.*;

/*
 * Prepared statement
 * executeUpdate(sqlQuery) this return 0(fail) or 1(success),this method is used for
 * performing query like insert,delete,update
 */

public class Example4 {

	public static void main(String[] args) {
		
		Connection connect = getMysqlDbConnection();
		if(!(connect.equals(null))) {
			System.out.println("Connection to Database done!");
		}
		else {
			System.out.println("Connection to Database Failed!");
		}
		String sqlQuery = "insert into login values (?,?)";
		try {
			PreparedStatement pst = connect.prepareStatement(sqlQuery);
			pst.setString(1, "Zenlabs");
			pst.setString(2, "Zen1010");
			int result = pst.executeUpdate();
			if(result == 1) {
				System.out.println("Inserted successfully !");
			}
			else {
				System.out.println("Not Inserted");
			}
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
	}
	
	public static Connection getMysqlDbConnection() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUsername = "root";
		String dbPassword = "Mysql30";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUsername, dbPassword);
		}
		catch(Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		return con;
	}
}
