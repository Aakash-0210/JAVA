package com.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
DatabaseMetaData is a JDBC interface that provides information about the database, such as its tables, columns, supported features, and database/driver details.
Connection
    ↓
Which database am I connected to?
    ↓
getCatalog()
    ↓
"student_management"
    ↓
DatabaseMetaData
    ↓
Give me tables from this database
*/
public class DataMetaDemo {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/student_management"; 
	String username = "root"; 
	String password = "your_password";
	try (Connection connection = DriverManager.getConnection(url, username, password)) { 
		DatabaseMetaData dm = connection.getMetaData();
		// Get the current database/schema  , it ask What database/catalog am I currently connected to
//		String schema = connection.getCatalog();
		String schema = "student_management";
		// Retrieve all tables
		ResultSet tables = dm.getTables(schema, null,"%" , new String[] {"TABLE"});
		System.out.println("Tables in database: " + schema); 
		while (tables.next()) { 
			String tableName = tables.getString("TABLE_NAME"); 
			System.out.println(tableName); }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
