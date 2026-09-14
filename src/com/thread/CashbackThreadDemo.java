package com.thread;
class CashbackThread implements Runnable {
int cashback = 10;

/*
Explain in your own words how using multiple threads can help an app like Zomato process order updates, send notifications, 
and calculate delivery time in parallel without making the user wait. Give one real example for each operation.


Multi-threading can be really applicable in an application like Zomato, any food delivery app. where the multipal tasks do not have to wait for the previous task to finish.
In this situation multiple threads can be used to do three different tasks. For example:
1. One thread can be used to update the real status of order and calculate the total price.
2. Second thread can  be used to give the notification that your order has been accepted.
3. Third one can be used to give the estimate of delivery time concurrently without waiting.

All three thread would work simultaneously.
*/
@Override
public void run() {
	for(int i = 1; i<=6; i++) {
		try {
			Thread.sleep(1000);
			cashback+=10;
			System.out.println(cashback);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	
}
	
	
}
class MusicCheck implements Runnable {

    public void run() {

        while (true) {

            System.out.println("Background music check running...");

            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
    }
}

public class CashbackThreadDemo {
public static void main(String[] args) throws InterruptedException {
	CashbackThread cashbackTask = new CashbackThread();
	Thread t1 = new Thread(cashbackTask);
	t1.start();
	t1.join();
	Thread.sleep(2000);
	System.out.println("Final amount " +cashbackTask.cashback);
	 MusicCheck mc = new MusicCheck();
	 Thread t2 = new Thread(mc);
	 t2.start();
    
	
}
}
