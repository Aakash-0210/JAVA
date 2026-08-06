package arrayAssginment.com;

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
			if(seats[row][col] == 'B') {
				total++;
			}
			
		}
	}
	System.out.println(total);
}
}
