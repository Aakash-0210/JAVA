package oppsAssignment.com;

class Playlists {
	int totalSong;
	public void addSong() {
		totalSong++;
		System.out.println("Song added to playlist");
	}
	public void checkSongCount() {
		System.out.println("total song.." + totalSong);
	}
}
public class Spotifyplaylist {
public static void main(String[] args) {
	Playlists p1 = new Playlists();
	p1.addSong();
	p1.checkSongCount();
}
	
}
