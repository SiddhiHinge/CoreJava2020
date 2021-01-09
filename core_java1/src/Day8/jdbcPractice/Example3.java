package Day8.jdbcPractice;

import java.sql.*;

/*
 * using Statement 
 * executeUpdate(sqlQuery) this return 0(fail) or 1(success),this method is used for
 * performing query like insert,delete,update
 */

public class Example3 {

	public static void main(String[] args) {
		
		Connection connect = getMysqlDbConnection();
		if(!(connect.equals(null))) {
			System.out.println("Connection to Database done!");
		}
		else {
			System.out.println("Connection to Database Failed!");
		}
		String sqlQuery = "insert into login values ('Admin','admin123')";
		try {
			Statement st = connect.createStatement();
			int result = st.executeUpdate(sqlQuery);
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
