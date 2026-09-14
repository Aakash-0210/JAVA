package com.thread;


class NotificationUpdater implements Runnable {
String msg;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		for(int i = 0; i<=3; i++) {
			try {
				Thread.sleep(5000);
				System.out.println(msg);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	
		
		
	}
	void displayMsg(){
		System.out.println("seen the msg");
	}
	
}
public class NotificationUpdaterDemo {
public static void main(String[] args) {
	
	NotificationUpdater n1= new NotificationUpdater();
	n1.msg = "You have new notifications!";
	Thread t1 = new Thread(n1);
	t1.start();
	try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	n1.displayMsg();
	
}
}
