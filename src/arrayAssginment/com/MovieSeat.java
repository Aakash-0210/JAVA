package arrayAssginment.com;
/*
 * A database table stores data like this:
| Song Name    | Artist          | Duration |
| ------------ | --------------- | -------- |
| Believer     | Imagine Dragons | 3:24     |
| Shape of You | Ed Sheeran      | 4:23     |
A 2D array stores it like this:
{
    {"Believer", "Imagine Dragons", "3:24"},
    {"Shape of You", "Ed Sheeran", "4:23"}
}
One row = One record (one song).
One column = One field (song name, artist, or duration).


///////////////////////////////////////////////////
/// A 2D array in Java is similar to a database table
/// Each row represents one record, and each column represents a field of that record.
/// For a Spotify playlist, each row can store one song, while the columns store the song name, artist, and duration
/// We access the data using array[row][column], just like rows and columns in a table.
*/

public class MovieSeat {
public static void main(String[] args) {
	char[][] seats = {
		    {'A', 'B', 'A', 'A', 'B', 'A'},
		    {'B', 'A', 'A', 'B', 'A', 'B'},
		    {'A', 'A', 'B', 'A', 'B', 'A'},
		    {'B', 'B', 'A', 'A', 'A', 'B'},
		    {'A', 'B', 'B', 'A', 'A', 'A'}
		};
	int total = 0;
	for(int row = 0; row < seats.length; row++) {
		for(int col = 0; col < seats[row].length; col++) {
			if(seats[row][col] == 'A') {
				total++;
			}
			
		}
	}
	System.out.println(total);
}
}
