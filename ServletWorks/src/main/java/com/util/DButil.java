package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DButil {

	Connection con = null;
	public Connection getConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Expenses_Db", "root", "aakash7654");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
