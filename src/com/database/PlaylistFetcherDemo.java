package com.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PlaylistFetcherDemo {
public static void main(String[] args) {

	try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spotifydb", "root", "aakash7654");
			PreparedStatement ps = con.prepareStatement(
					"SELECT * FROM musics "
					);
			
			ResultSet rs = ps.executeQuery();
		
			
			
			
			) {
		DatabaseMetaData dm = con.getMetaData();
                    
		ResultSetMetaData rd = rs.getMetaData();
		int count = rd.getColumnCount(); 
		for(int i =1; i<=count; i++) {
			System.out.print(rd.getColumnName(i) + "  | ");
		}
		System.out.println();
		System.out.println("----------------------------------------");

		
while(rs.next()) {
	
	
	System.out.println(rs.getString("Artist") + "  |  " + rs.getString("musicName") + "  |   " + rs.getString(3)  + "  |   " + rs.getInt(4));
	
}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("connection failed");
	}
}
}
