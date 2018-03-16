package com.oops.assessmodifiers.p1;

public class A {
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;

	public void showA() {
		System.out.println("A->show()");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}

class B extends A {
	public void showB() {
		System.out.println("B->show()");
		//System.out.println(a);// Private can't visible in sub class
		System.out.println(b);// Default
		System.out.println(c);// Protected
		System.out.println(d);// Public

	}
}

class C {
	public void showC() {
		System.out.println("C->show()");
		A a1 = new A();
		//System.out.println(a1.a);// Private
		System.out.println(a1.b);// Default
		System.out.println(a1.c);// Protected
		System.out.println(a1.d);// Public
	}
}
