package basic.com;

public class Assginment01_DataType {
public static void main(String[] args) {
	String productName = "iphone";
	double price =  79999.99;
	boolean inStock = true;
	float rating = 4.5f;
	System.out.println(productName);
	System.out.println(price);
	System.out.println(inStock);
	System.out.println(rating);
//////////////////////////////////////////////////////////////////////////////////
/// Task -2
	 double balance = 800;

     if (balance > 500) {
         double cashback = balance * 10 /100;
         balance = balance + cashback;
      // Balance remains unchanged
     }

     System.out.println("Final Balance :" + balance);
     
     
/////////////////////////////////////////////////////////////////////////////////////
/// Task - 3
     int age = 29;
     boolean hasPaymentMethod = true;

     if (age >= 18 && hasPaymentMethod) {
         System.out.println("Booking Allowed");
     } else {
         System.out.println("Booking Not Allowed");
     }
     
 //////////////////////////////////////////////////////////////////////////////////////
 /// Task -4
 int unReadMsg = 74;
 String message = (unReadMsg ==0) ?  "No message"  : (unReadMsg <=10) ? "Few message": "Too many message";
 System.out.println(message);
 
 
 /////////////////////////////////////////////////////////////////////////////////////////
 /// Task -5
 float num = 444.5f;
 int num2 = (int)num;
 double num3 = num2;
 System.out.println(num);
 System.out.println(num2);
 System.out.println(num3);
}
}
