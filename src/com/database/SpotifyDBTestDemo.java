package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	PreparedStatement ps = con.prepareStatement(
"INSERT INTO Musics(Artist, musicName, duration) VALUES (?,?,?)"
			);
	
	ps.setString(1, "aakash");
	ps.setString(2, "kafirana");
	ps.setString(3, "2:20");
	
	PreparedStatement ps2 = con.prepareStatement(
			"SELECT * FROM Musics"
			);
	PreparedStatement psDelete = con.prepareStatement(
			"DELETE FROM Musics WHERE Artist = ?"
			);

	psDelete.setString(1, "vinay");
//			setInt(placeholder_number, value)
	
//	int x = st.executeUpdate("INSERT INTO Musics(Artist, musicName, duration) VALUES( '"+artist+"', +'"+musicname+"', + '"+duration+"')");
//	if(x >0) {
//		System.out.println("data inserted into database");
//	}
int row = ps.executeUpdate();
if(row > 0) {
	System.out.println("data inserted into database");
}
System.out.println(row);
ResultSet rs = ps2.executeQuery();

while(rs.next()) {
	
	System.out.println(rs.getString("Artist"));
}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}
