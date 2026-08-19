package exception.com;

class NumberFormatException extends Exception{
	NumberFormatException(String msg){
		super(msg);
	}
}
class InsufficientBalanceException extends Exception{
	
	InsufficientBalanceException(String msg){
		super(msg);
	}
}
class OutOfStockException extends Exception {
	 
	OutOfStockException(String msg){
		super(msg);
	}
	
}
class PaymentHandler {
static void processPayment(int amount) throws NumberFormatException,InsufficientBalanceException{
	
 int balance = 1000;
	if(amount < 0) {
		throw new NumberFormatException("Enter valid amount, more then 0 " + amount);
	} else if(amount >balance) {
		throw new InsufficientBalanceException("Your balance is insufficient" + "Your balance is " + balance + " and" + " The amount is " + amount );
	}
	System.out.println("Let's process this" + amount +  "payment through PhonePe");
		
	
		
	}
}
class ShoppingCart{
	
    static int availableStock = 5;
   public static void addTocart(int quantity) throws OutOfStockException{
    	if(quantity > availableStock) {
    		throw new OutOfStockException("Requested quantity (" + quantity + ") exceeds available stock (" + availableStock + ").");
    	}
    	System.out.println("Order is Placed." + " Your quantity for this order is " + quantity);

    }

}
public class Assginment_14 {
public static void main(String[] args) {
	try 
	{
		ShoppingCart.addTocart(6);

	} catch (OutOfStockException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		
	}
	
///////////////////////////Task -2
	try {
		PaymentHandler.processPayment(2300);
	} catch (NumberFormatException | InsufficientBalanceException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
//		e.printStackTrace();
	}

}
}


