package com.oops.interfaces;

public class Lab545 {
	public static void main(String[] args) {
		Inter5 ref = new Hai();
		ref.m1();//Hello->m1() :10
		ref.m2();//Hello->m2() :20
		//ref.m3();// The method m3() is undefined for the type Inter5

		// Same logic: when we're calling method with ref of super class which
		// contains sub class object,method signature must be available in super
		// class as well, if not will throw error
	}

}

interface Inter5 {
	void m1();

	public abstract void m2();

	int a = 10;
	public final int b = 20;
}

abstract class Hello5 implements Inter5 {

	@Override
	public void m1() {
		System.out.println("Hello->m1() :" + a);
	}
}

class Hai extends Hello5 {
	@Override
	public void m2() {
		System.out.println("Hello->m2() :" + b);

	}

	void m3() {
		System.out.println("Hai->m3()");
	}
}