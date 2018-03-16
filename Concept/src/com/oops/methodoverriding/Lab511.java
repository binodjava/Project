package com.oops.methodoverriding;

public class Lab511 {
	public static void main(String[] args) {
		new B17().m1();
	}

}

class A17 {
	public void m1() {
	}
}

class B17 extends A17 {
	protected void m1() {// Cannot reduce the visibility of the inherited method
							// from A17
	}
}