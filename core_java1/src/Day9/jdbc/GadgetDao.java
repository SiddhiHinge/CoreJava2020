package Day9.jdbc;

import java.sql.*;
import BeansClass.Gadget;
import Utility.DbUtil;

public class GadgetDao {

	public void addGadget(Gadget g) {

		Connection connect = DbUtil.getMysqlDbConnection();
		String insert = "insert into gadget values (?,?,?)";
		try {
			PreparedStatement pst = connect.prepareStatement(insert);
			pst.setInt(1, g.getGadgetId());
			pst.setString(2, g.getGadgetName());
			pst.setInt(3, g.getPrice());

			int result = pst.executeUpdate();
			if (result == 1) {
				System.out.println("Inserted successfully !");
			} else {
				System.out.println("Not Inserted !");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void viewGadget() {

		Connection connect = DbUtil.getMysqlDbConnection();
		String select = "select * from gadget";
		try {
			PreparedStatement pst = connect.prepareStatement(select);
			ResultSet result = pst.executeQuery();
			while (result.next()) {
				System.out.println("Displaying from database of Gadget !");
				int db_gadgetId = result.getInt("Gadget_Id");
				String db_gadgetName = result.getString("Gadget_Name");
				int db_price = result.getInt("Price");
				Gadget g = new Gadget(db_gadgetId, db_gadgetName, db_price);
				System.out.println(g);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getGadgetById(int gadgetId) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "select * from gadget where Gadget_Id = ?";
		try {

			PreparedStatement pst = connect.prepareStatement(query);
			pst.setInt(1, gadgetId);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				int db_gadgetId = rs.getInt("Gadget_Id");
				String db_gadgetName = rs.getString("Gadget_Name");
				int db_price = rs.getInt("Price");
				Gadget g = new Gadget(db_gadgetId, db_gadgetName, db_price);
				System.out.println(g);
			} else {
				System.out.println("Gadget not found !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void deleteGadgetByName(String gadgetName) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String query = "delete from gadget where Gadget_Name = ?";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setString(1, gadgetName);
			int rs = pst.executeUpdate();
			if (rs > 0) {
				System.out.println("Gadget deleted successfully !");
			} else {
				System.out.println("Gadget not deleted !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateByGadgetId(Gadget g) {
		Connection connect = DbUtil.getMysqlDbConnection();
		String newName = "Headphones";
		System.out.println("Updating GadgetId "+g.getGadgetId());
		System.out.println("Old name of Gadget : "+g.getGadgetName());
		System.out.println("New name of Gadget to be updated : "+newName);
		String query = "update gadget set Gadget_Name = ? where Gadget_Id = ?";
		try {
			PreparedStatement pst = connect.prepareStatement(query);
			pst.setString(1, newName);
			pst.setInt(2, g.getGadgetId());
			int rs = pst.executeUpdate();
			if (rs > 0) {
				System.out.println("Gadget updated successfully !");
			} else {
				System.out.println("Gadget not updated !");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
