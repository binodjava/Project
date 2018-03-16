package com.oops.dynamicdispatch;

public class Lab525 {
	public static void main(String[] args) {
		B2 b = new B2();
		b.show();
//Here ref and object is both sub class, so call will go to sub class only 

	}

}

class A2 {
	int x = 20;
}

class B2 extends A2 {
	String x = "JLC";

	void show() {
		System.out.println(x);//JLC
		System.out.println(super.x);//10   just immediate super class call
	}

}