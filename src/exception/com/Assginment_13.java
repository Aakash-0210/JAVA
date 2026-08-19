package exception.com;

import java.util.Scanner;
class InsufficientFundsException extends Exception{
	int amount;
	public InsufficientFundsException(int amount){
		this.amount = amount;
		
	}
	
}
public class Assginment_13 {
	public static void sendMoney(int amount) throws InsufficientFundsException {
		int balance = 5000;
		if(amount <= balance) {
			balance = balance - amount;	
			System.out.println("your balance is"+ " " + balance + " " + " because You have send the money" + " " + amount);
			}else {
				System.out.println("your balance is..." + balance);
				throw new InsufficientFundsException(amount);
			}
	}
 	public static void withdrawAmount(int balance, int amount) throws Exception  {
		if(amount < balance) {
		balance = balance -amount;	
		System.out.println("your balance is..." + balance);
		}else {
			System.out.println("your balance is..." + balance);
			throw new Exception("because amount is not sufficient");
		}
		
	}
public static void main(String[] args) {
///////////////////////////// Task 1
	try {
		withdrawAmount(4000, 5000);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
//////////////////////////////// Task 2
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter wallet balance: ");
     int balance = sc.nextInt();

     System.out.print("Enter purchase amount: ");
     int amount = sc.nextInt();
     try {
    	 if(amount > balance) {
    		throw new Exception("Your balance is Insufficient");
    		
    	 } else {
    		 System.out.println("You have sufficient balance you can buy product");
    		 balance = balance -amount;
    		 System.out.println("You remaining balance..." + balance);
    	 }
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
     sc.close(); 
     
////////////////////////Task 3
/// 
try {
sendMoney(5000);
} catch (InsufficientFundsException e) {
// TODO: handle exception
System.out.println("because balance is Inufficient " + "you can not send this money" + " " + e.amount );
}


////////////////////// Task 4
int[] transactions = {500, 1200, -300, 800, -100};

for (int amount1 : transactions) {

    try {

        if (amount1 < 0) {
            throw new Exception("Invalid transaction amount");
        }

        System.out.println("Transaction successful: " + amount1);

    } catch (Exception e) {

        System.out.println("Transaction failed: " + e.getMessage());

    } finally {

        System.out.println("Transaction complete");
    }
}

}
}
