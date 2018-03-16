package com.oops.methodoverriding;

public class Lab513 {
	public static void main(String[] args) {
		B19 bobj = new B19();
		bobj.m1();//B->m1()

	}

}

class A19 {
	void m1() {
		System.out.println("A->m1()");
	}
}

class B19 extends A19 {
	void m1() {
		System.out.println("B->m1()");
	}
}
