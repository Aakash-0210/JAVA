package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SportifyPlaylist {
public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SpotifyDB", "root", "aakash7634");
		String query = "SELECT song_title, artist FROM playlists WHERE playlist_id = ?";
		PreparedStatement ps = con.prepareStatement(query);

		int playlistId = 1;
		ps.setInt(1, playlistId);

ResultSet rs = ps.executeQuery();
while (rs.next()) {
    String songTitle = rs.getString("song_title");
    String artist = rs.getString("artist");

    System.out.println(songTitle + " - " + artist);
}


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
