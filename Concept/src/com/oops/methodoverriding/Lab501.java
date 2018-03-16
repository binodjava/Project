package com.oops.methodoverriding;

public class Lab501 {
	public static void main(String[] args) {

		B7 b = new B7();
		b.m1();
	}

}

class A7 {
	void m1() {
	}
}

class B7 extends A7 {
	final void m1() {
	}
}
