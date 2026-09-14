package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class FlipkartOrderManager{
	Connection con;
	FlipkartOrderManager(Connection con){
		this.con = con;
	}
	
	void updateOrderStatus (int id) {
		try {
			PreparedStatement Update = con.prepareStatement(
              "UPDATE INTO Orders WHERE ID = ?"
					);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class FlipkartOrderManagerDemo {

}
