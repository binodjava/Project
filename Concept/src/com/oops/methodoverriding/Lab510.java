package com.oops.methodoverriding;

public class Lab510 {
	public static void main(String[] args) {
		new B16().m1();

	}

}

class A16 {
	protected void m1() {
	}

	protected void m2() {
	}
}

class B16 extends A16 {
	protected void m1() {
	}

	public void m2() {
	}
}
