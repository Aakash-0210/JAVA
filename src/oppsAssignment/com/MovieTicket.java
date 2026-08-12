package oppsAssignment.com;
class MovieTickets {
	String movieTitle;
	String seatNumber;
	public MovieTickets() {
this.movieTitle = "Avatar";
this.seatNumber = "12";
	}
	public void printTicket() {
		System.out.println(movieTitle + " and "+seatNumber);
	}
}
public class MovieTicket {
public static void main(String[] args) {
	MovieTickets m1 = new MovieTickets();
	m1.printTicket();
}
}
