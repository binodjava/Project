package com.oops.inheritance.withsuperkeyword;

public class Lab448 {
	public static void main(String[] args) {
		new B2(10);

	}

}

class A2 {
	A2() {
		System.out.println("A->D.C");
	}
}

class B2 extends A2 {
	B2() {
		System.out.println("B->D.C");
	}

	B2(int a) {
		this();
		System.out.println("B (int)");
	}
}

/*
A->D.C
B->D.C
B (int)*/
