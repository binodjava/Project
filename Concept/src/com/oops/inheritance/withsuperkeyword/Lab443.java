package com.oops.inheritance.withsuperkeyword;

public class Lab443 {
	public static void main(String[] args) {

	}

}

class Hai3 {
	static int a = 10;
}

class Hello3 extends Hai3 {
	static int a = 20;

	static void show() { // from static context, only static member can be
							// access
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);// Cannot use this in a static context
		System.out.println(super.a);// Cannot use this in a static context
		// since mehtod is static
	}

}