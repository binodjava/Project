package com.oops.inheritance.withsuperkeyword;

public class Lab447 {
	public static void main(String[] args) {

	}

}

class A1 {
	A1(int a) {
		System.out.println("A (int) Const");
	}
}

class B1 extends A1 {
	B1() {
		//super(10);
		System.out.println("B->D.C");
		super(10);//Constructor call must be the first statement in a constructor
	}
}