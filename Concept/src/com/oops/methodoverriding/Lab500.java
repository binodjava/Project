package com.oops.methodoverriding;

public class Lab500 {
	public static void main(String[] args) {
		B6 b = new B6();
		b.m1();

	}

}

class A6 {
	final void m1() {
	}
}

class B6 extends A6 {
	void m1() {
	}// Cannot override the final method from A6
}
