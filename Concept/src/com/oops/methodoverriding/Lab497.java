package com.oops.methodoverriding;

public class Lab497 {
	public static void main(String[] args) {
		Hai hai=new Hai();
		hai.m1();

	}
}

class Hello {
	A3 m1() {
		return new A3();
	}
}

class Hai extends Hello {
	B3 m1() {//The return type is incompatible with Hello.m1()
		return new B3();
	}
}

class A3 {
}

class B3 {
}