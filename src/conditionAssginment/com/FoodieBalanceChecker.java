package conditionAssginment.com;

import java.util.Scanner;

public class FoodieBalanceChecker {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("write you wallet balance...");
  int walletBalance = sc.nextInt();
  if(walletBalance <100) {
	  System.out.println("lower Balance warning.." + walletBalance);
	  
  }else {
	  System.out.println("Sufficient Balance");
  }
  
}
}
