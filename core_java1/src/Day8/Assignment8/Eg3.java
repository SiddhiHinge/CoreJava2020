package Day8.Assignment8;

import java.sql.*;

public class Eg3 {

	public static void main(String[] args) {
		
		Connection connect = getconnected();
		String query = "insert into student values (123,'Draco Malfoy','C++',15,22)";
		try {
			Statement st = connect.createStatement();
			int result = st.executeUpdate(query);
			if(result > 0) {
				System.out.println("Inserted successfully !");
			}
			else {
				System.out.println("Not Inserted !");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static Connection getconnected() {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUsername = "root";
		String dbPassword = "Mysql30";
		Connection con = null;
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(url, dbUsername, dbPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
