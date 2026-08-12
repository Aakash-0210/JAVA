package oppsAssignment.com;

import java.util.Scanner;

class Orders {
	
	String[] order= new String[5];
	
	void addItem() {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<order.length; i++ ) {
			System.out.println("Enter order..");
			order[i] = sc.nextLine();
		}
		
	}
	void getOrderSummary() { 
		for(int i=0; i<order.length; i++ ) {
			System.out.println("your orders.." + order[i] );
			
		}
	}
}
public class FoodOrder {
public static void main(String[] args) {
Orders o1 = new Orders();
o1.addItem();
o1.getOrderSummary();

}

}
