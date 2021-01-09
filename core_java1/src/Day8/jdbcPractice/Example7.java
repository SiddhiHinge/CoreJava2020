package Day8.jdbcPractice;

import java.sql.*;
import BeansClass.Gadget;
import Utility.DbUtil;

public class Example7 {

	public static void main(String[] args) {
		
		Gadget g1 = new Gadget(121, "Headphones", 3400);
		Example7 example7 = new Example7();
		//example7.addGadget(g1);
		example7.viewGadget();
	}
	
	public void addGadget(Gadget g) {
		
		Connection connect = DbUtil.getMysqlDbConnection();
		String insert = "insert into gadget values (?,?,?)";
		try {
			PreparedStatement pst = connect.prepareStatement(insert);
			pst.setInt(1,g.getGadgetId());
			pst.setString(2,g.getGadgetName());
			pst.setInt(3,g.getPrice());
			
			int result = pst.executeUpdate();
			if(result == 1) {
				System.out.println("Inserted successfully !");
			}
			else {
				System.out.println("Not Inserted !");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void viewGadget() {
		
		Connection connect = DbUtil.getMysqlDbConnection();
		String select = "select * from gadget";
		try {
			PreparedStatement pst = connect.prepareStatement(select);
			ResultSet result = pst.executeQuery();
			if(result.next()) {
				System.out.println("Displaying from database of Gadget !");
				int db_gadgetId = result.getInt("Gadget_Id");
				String db_gadgetName = result.getString("Gadget_Name");
				int db_price = result.getInt("Price");
				Gadget g = new Gadget(db_gadgetId, db_gadgetName, db_price);
				System.out.println(g);
			}
			else {
				System.out.println("Not displaying !");
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
