package Day8.Assignment8;

import java.sql.*;
import Utility.DbUtil;

public class Eg4 {

	public static void main(String[] args) {
		
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "insert into student values (?,?,?,?,?)";
		
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1,124);
			pst.setString(2, "Rubeus Hagrid");
			pst.setString(3, "NodeJs");
			pst.setInt(4, 60);
			pst.setInt(5, 19);
			int result = pst.executeUpdate();
			if (result > 0) {
				System.out.println("Inserted successfully");
			}
			else {
				System.out.println("Not Inserted");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
