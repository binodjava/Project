package com.oops.inheritance.withsuperkeyword;

public class Lab445 {
	public static void main(String[] args) {
		new B();

	}

}

class A {
	A(int a) {
		System.out.println("A (int) Cons");
	}
}

class B extends A {
	B() {
		super();//The constructor A() is undefined
//		we're calling default A constructor,but its not defined
//		so, to remove error, need to pass some value in super constructor
		//super(10);
		System.out.println("B->D.C");
	}
}