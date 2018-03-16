package com.oops.methodoverriding;

public class Lab494 {
	public static void main(String[] args) {

		B bobj = new B();
		bobj.show();
		bobj.SHOW();
	}

}

/*A->show()
b->SHOW()
This is not method over riding*/

class A {
	void show() {
		System.out.println("A->show()");
	}
}

class B extends A {
	void SHOW() {
		System.out.println("b->SHOW()");
	}
}