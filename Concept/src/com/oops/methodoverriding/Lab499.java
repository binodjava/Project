package com.oops.methodoverriding;

public class Lab499 {
	public static void main(String[] args) {
		Hai2 hai = new Hai2();
		hai.m1();

	}

}

class Hello2 {
	A5 m1() {
		return new A5();
	}
}

class Hai2 extends Hello2 {
	B5 m1() {
		return new B5();
	}
}

class A5 {
}

class B5 extends A5 {
}