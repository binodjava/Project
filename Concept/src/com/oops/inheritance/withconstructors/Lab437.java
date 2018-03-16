package com.oops.inheritance.withconstructors;

public class Lab437 {
	public static void main(String[] args) {
		new B();
	}

}

class A {
	A() {
		System.out.println("A->D.C");
	}
}

class B extends A {
	B() {
		System.out.println("B->D.C");
	}
}


/*A->D.C
B->D.C
*/