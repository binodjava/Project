package com.oops.methodoverriding;

public class Lab508 {
	public static void main(String[] args) {
		new B14().m1();

	}

}

class A14 {
	void m1() {
	}

	void m2() {
	}

	void m3() {
	}

}

class B14 extends A14 {
	void m1() {
	}

	protected void m2() {
	}

	public void m3() {
	}
//	default can be overridden with default/protected/public nut not with private
}