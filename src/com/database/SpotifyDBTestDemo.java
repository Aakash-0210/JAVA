package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SpotifyDBTestDemo {
public static void main(String[] args) throws ClassNotFoundException {
try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SpotifyDB", "root", "aakash7654");
	System.out.println("Connection established");
	Statement st = con.createStatement();
	String artist = "kabir";
	String musicname = "dreak";
	String duration = "2:20";
	
	int x = st.executeUpdate("INSERT INTO Musics(Artist, musicName, duration) VALUES( '"+artist+"', +'"+musicname+"', + '"+duration+"')");
	if(x >0) {
		System.out.println("data inserted into database");
	}
ResultSet rs = st.executeQuery("SELECT * FROM Musics WHERE ID = 1");

while(rs.next()) {
	
	System.out.println(rs);
}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
