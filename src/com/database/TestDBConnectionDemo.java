package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBConnectionDemo {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/music_db", "root","aakash7654");
//		no password enter error 
		System.out.println("Connection established...");

		Statement st = con.createStatement();
		
		/*
 Java Application
       ↓
   JDBC API
       ↓
 DriverManager
       ↓
  MySQL Driver
       ↓
    MySQL
MySQL      → MySQL JDBC Driver
Oracle     → Oracle JDBC Driver
SQL Server → SQL Server JDBC Driver
		
		*/
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
