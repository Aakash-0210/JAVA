package conditionAssginment.com;

import java.util.Scanner;

public class ZomatoCuisineFilter {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
System.out.print("enter your desired CUisine type..");
	String cuisin = sc.nextLine();
switch(cuisin){
case "Indian": {
	System.out.println("Gujarati beko");
	break;
	}
case "Chinese" :{
	System.out.println("ramain deku");
	break;
}
case "Italina":
{
	System.out.println("Tako belo");
break;
	}
default:{
	System.out.println("Cuisine Not Found");
}

////////////////////////////////////////////////////////////////////

//I find the simple if-else version clearer because it is shorter
//and easier to understand. The nested if is useful only when an
//extra condition (such as validating the cart total) is required.
int cartTotal = 0;
String status;
if(cartTotal >=500) {
	status = "Eligible for Free Delivery";
	
} else {
	status = "Add more items for Free Delivery";
	
}
System.out.println(status);
if(cartTotal > 0) {
	if(cartTotal >= 500) {
		status = "Eligible for Free Delivery";

	}else {
		status = "Add more items for Free Delivery";
		
	}
}else {
	
		status = "No Items are in Cart";	
	
}
System.out.println(status);
}
}
}
