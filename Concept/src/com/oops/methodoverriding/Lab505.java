package com.oops.methodoverriding;

public class Lab505 {
	public static void main(String[] args) {
		new B11().m1();
//		no comilation error, running fine

	}

}

class A11 {
	native void m1();

	void m2() {
	}

}

class B11 extends A11 {
	void m1() {
		//System.out.println("-------------");
	}

	native void m2();
}
