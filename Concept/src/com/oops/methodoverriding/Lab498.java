package com.oops.methodoverriding;

public class Lab498 {
	public static void main(String[] args) {
		Hai1 hai = new Hai1();
		hai.m1();

	}

}

class Hello1 {
	A4 m1() {
		return new A4();
	}
}

class Hai1 extends Hello1 {
	A4 m1() {
		return new A4();
	}
}

class A4 {
}

class B4 extends A4 {
}