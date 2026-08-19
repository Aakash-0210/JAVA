package exception.com;
class OutOfStockException2 extends Exception {
    OutOfStockException2(String msg) {
        super(msg);
    }
}

class InsufficientWalletBalanceException extends Exception {
    InsufficientWalletBalanceException(String msg) {
        super(msg);
    }
}
class TicketBooking{
	   int userBalance = 100;
      
       TicketBooking(int ticketPrice  ) throws InsufficientWalletBalanceException{
    	   if(userBalance < ticketPrice) {
    		   throw new InsufficientWalletBalanceException( "Insufficient funds. Your balance is ₹"
                       + userBalance
                       + " but the ticket price is ₹"
                       + ticketPrice);
    	   }
    	   System.out.println("Booking successful!");
    	   
       }
}
public class ZomatoOrder {
	  static int stock = 5;
	   static int walletBalance = 1000;
	   static void placeOrder(int quantity, int amount)
	            throws OutOfStockException2, InsufficientWalletBalanceException {

	        if (amount < 0) {
	            throw new IllegalArgumentException("Order amount cannot be negative.");
	        }

	        if (quantity > stock) {
	            throw new OutOfStockException2("Sorry, the dish is out of stock.");
	        }

	        if (amount > walletBalance) {
	            throw new InsufficientWalletBalanceException(
	                "Insufficient wallet balance. Your balance is ₹"
	                + walletBalance + "."
	            );
	        }
	       

	        stock -= quantity;
	        walletBalance -= amount;

	        System.out.println("Order placed successfully!");
	        System.out.println("Amount paid: ₹" + amount + " and " + walletBalance);
}
public static void main(String[] args) {
	try {
		TicketBooking user1 = new TicketBooking(13200);
	} catch (InsufficientWalletBalanceException e) {
		System.out.println("Error: " + e.getMessage());
		e.printStackTrace();
	}
	 try {
         placeOrder(2, 200);
         

     } catch (OutOfStockException2 e) {
         System.out.println("Order failed: " + e.getMessage());

     } catch (InsufficientWalletBalanceException e) {
         System.out.println("Payment failed: " + e.getMessage());

     } catch (IllegalArgumentException e) {
         System.out.println("Invalid order: " + e.getMessage());
     }
}
}
