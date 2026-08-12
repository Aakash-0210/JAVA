package oppsAssignment.com;

class BookTicket {
	double price;
	static int  totalTickets;
	void bookTicket(int amount) {
		this.totalTickets += amount;
		
	}
	static void  checkTotalTickets() {
		System.out.println(totalTickets);
	}
}
public class MovieTicketOpp {
public static void main(String[] args) {

	BookTicket t1 = new BookTicket();
	BookTicket.totalTickets = 404;
	BookTicket.checkTotalTickets();
	}
}
