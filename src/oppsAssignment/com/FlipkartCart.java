package oppsAssignment.com;
class CartItem {
	String itemName  = "Headphone";
	 int quantity  = 3;
	int increaseQuantity(int quantity){
		 this.quantity+=quantity ;
		return  this.quantity;
	}
}
public class FlipkartCart {
	
public static void main(String[] args) {
	CartItem p1 = new CartItem();
	p1.increaseQuantity(20);
	System.out.println(p1.quantity);
}
}
