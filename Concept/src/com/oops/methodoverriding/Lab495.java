package com.oops.methodoverriding;

public class Lab495 {
	public static void main(String[] args) {
		B1 bobj = new B1();
		bobj.show(99);
		bobj.show("BK");

	}

}

/*
 * A->show(int) B->show(String)
 */
// In Over-riding method signature will be 100% same

class A1 {
	void show(int ab) {
		System.out.println("A->show(int)");
	}
}

class B1 extends A1 {

	void show(String ab) {// this is overloading not over-riding
		System.out.println("B->show(String)");
	}
}