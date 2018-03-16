package com.oops.methodoverriding;

public class Lab502 {
	public static void main(String[] args) {
		B8 b = new B8();
		b.m1();

	}

}

class A8 {
	void m1() {
	}
}

class B8 extends A8 {
	static void m1() {// This static method cannot hide the instance method from
						// A8
	}
}