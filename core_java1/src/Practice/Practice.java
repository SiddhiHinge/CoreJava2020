package Practice;

import java.sql.*;

import Utility.DbUtil;

public class Practice {

	public static void main(String[] args) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query1 = "insert into fruit values (?,?)";
		String query2 = "insert into vegetable values (?,?)";

		try {

			connect.setAutoCommit(false);
			PreparedStatement pst1 = connect.prepareStatement(query1);
			pst1.setString(1, "Mango");
			pst1.setInt(2, 500);
			int result1 = pst1.executeUpdate();

			PreparedStatement pst2 = connect.prepareStatement(query2);
			pst2.setString(1, "Brinjal");
			pst2.setInt(2, 50);
			int result2 = pst2.executeUpdate();

			if ((result1 > 0) && (result2 > 0)) {
				System.out.println("Both insertion successful !");
			} else if ((result1 > 0) && (result2 == 0)) {
				System.out.println("First insertion successful !");
				System.out.println("Second insertion failed !");
			} else if ((result1 == 0) && (result2 > 0)) {
				System.out.println("First insertion failed !");
				System.out.println("Second insertion successful !");
			} else {
				System.out.println("Both insertion failed !");
			}
			connect.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				connect.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
