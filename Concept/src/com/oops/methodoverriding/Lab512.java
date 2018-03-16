package com.oops.methodoverriding;

public class Lab512 {
	public static void main(String[] args) {
		new B18().m1();

	}

}

class A18 {
	public void m1() {
		System.out.println("m1");
	}
}

class B18 extends A18 {
	public void m1() {
		System.out.println("m");
	}
}
