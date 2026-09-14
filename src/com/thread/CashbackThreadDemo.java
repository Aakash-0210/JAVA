package com.thread;
class CashbackThread implements Runnable {
int cashback = 10;

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
	 
     mc.run();
	
}
}
