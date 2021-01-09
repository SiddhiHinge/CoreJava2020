package Day8.jdbcPractice;

import java.sql.*;

import Utility.DbUtil;

public class Example5 {

	public static void main(String[] args) {
		String uname = "Zensar";
		String pass = "zen123";
		Connection connect = DbUtil.getMysqlDbConnection();
		String sqlQuery = "select * from login where Username = ?";
		
		try {
			PreparedStatement pst = connect.prepareStatement(sqlQuery);
			pst.setString(1, uname);
			ResultSet rs = pst.executeQuery();
			
			int row = rs.getRow();
			System.out.println("Current Row number : "+row);//This returns the current row number

			if (rs.next()) {
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				if ((uname.equals(username)) && (pass.equals(password))) {
					System.out.println("Success Login !");
				} else {
					System.out.println("Failed Login !");
				}

			} else {
				System.out.println("Username not found !");
			}

		} catch (Exception e) {
			System.out.println("Error occured : " + e);
		}
	}

}
