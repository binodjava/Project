package com.map;

public class Lab764 {
	public static void main(String[] args) {
		Hello h1=new Hello();
		Hello h2=new Hello();
		MyThread1 th1=new MyThread1(h1);
		MyThread1 th2=new MyThread1(h1);
		//MyThread1 th2=new MyThread1(h2);
		th1.start();
		th2.start();
	}
}

class MyThread1 extends Thread {
	Hello h = null;

	MyThread1(Hello h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}
}

class Hello {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + " SHOW :" + i + this);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}