package com.oops.methodoverriding;

public class Lab509 {
	public static void main(String[] args) {

	}

}

class A15 {
	protected void m1() {
	}

	protected void m2() {
	}

}
//protected->protected/public 

class B15 extends A15 {

	private void m1() {//Cannot reduce the visibility of the inherited method from A15
	}

	void m2() {//Cannot reduce the visibility of the inherited method from A15
	}
}
