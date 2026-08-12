package oppsAssignment.com;
class Playlist {
	private String playlistName ;
	int totalSongs  = 234;
	
	void displayInfo(String playlistName){
		 this. playlistName = playlistName;
		System.out.println("name of singer.." + this.playlistName);
		System.out.println("toatal song.." + totalSongs);
	}
}
public class PlaylistOpp {
public static void main(String[] args) {
	Playlist p1 = new Playlist();
	p1.displayInfo("Arijit");
	
	
}
}
