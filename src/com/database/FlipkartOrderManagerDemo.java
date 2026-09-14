package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*

Paytm – Unauthorized transactions
If SQL Injection were not prevented in Paytm's database, an attacker could manipulate a query and potentially access or modify users' account information,
 transaction records, or wallet balances. This could lead to financial loss and unauthorized transactions.
Instagram – Access to user data
If Instagram's database were vulnerable to SQL Injection, an attacker could potentially manipulate database queries to access private user information 
such as usernames, emails, or other stored data. This could cause a major privacy breach and exposure of user accounts.
g

*/
class FlipkartOrderManager{
	Connection con;
	FlipkartOrderManager(Connection con){
		this.con = con;
	}
	
	void updateOrderStatus (int id, String status) {
		try {
			PreparedStatement Update = con.prepareStatement(
              "UPDATE Orders SET status = ? WHERE ID = ?");
			Update.setString(1, status);
			Update.setInt(2, id);
			int row = Update.executeUpdate();
			if(row >0) {
				System.out.println("Update Successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void deleteCartItem (int cart_item_id) {
		try {
			PreparedStatement Delete = con.prepareStatement(
					"DELETE FROM OrdersCard WHERE ID = ?"
					);
			Delete.setInt(1, cart_item_id);
			int row = Delete.executeUpdate();
					
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	void LoginUser(String username, String password) {
		try {
			PreparedStatement Insert = con.prepareStatement(
					"INSERT INTO User(username, password) VALUES (?,?)");
			Insert.setString(1, username);
			Insert.setString(2, password);
			int row = Insert.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class FlipkartOrderManagerDemo {
public static void main(String[] args) {
	Connection con;
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SpotifyDB", "root", "aakash7654");
		FlipkartOrderManager order1 = new FlipkartOrderManager(con);
		order1.updateOrderStatus(2, "Delivered");
		order1.deleteCartItem(3);
		order1.LoginUser("vinay", "asdfsam98");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
}
