/*package com.threads.synchronization;

public class Lab762 {
	public static void main(String[] args) throws InterruptedException {
		MyThread th = new MyThread();
		Thread t1 = new Thread(th);
		t1.start();
		Thread.sleep(500);
		System.out.println(t1.getState());
		Thread.sleep(5000);
		System.out.println(t1.getState());

	}

}

class MyThread extends Thread {
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println(th.getName() + " -value is :" + i + "\t"
					+ th.getState());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
*/