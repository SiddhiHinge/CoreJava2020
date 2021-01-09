package Day8.jdbcPractice;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

//Demo of jdbc connection with prepared statment

public class Example2 {
	public static void main(String[] args) {
		String driverClassName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/java_training";
		String dbUserName = "root";
		String dbPassword = "Mysql30";
		
		try {
			Class.forName(driverClassName); //Is used to load the driver in memory
			Connection con = DriverManager.getConnection(url, dbUserName, dbPassword);
			//System.out.println("Connection:"+con);
			String sqlQuery = "select * from login";
			PreparedStatement pst = con.prepareStatement(sqlQuery);
			ResultSet resultSet = pst.executeQuery();
			//System.out.println(resultSet);//Gives address of ResultSet
			while(resultSet.next()) {
				String userName = resultSet.getString("Username");
				String password = resultSet.getString("Password");
				System.out.println("Username : "+userName);
				System.out.println("Password : "+password);
				System.out.println("--------------------------------------");
			}
		}
		catch(Exception e) {
			System.out.println("Error : ");
		}
	}

}
