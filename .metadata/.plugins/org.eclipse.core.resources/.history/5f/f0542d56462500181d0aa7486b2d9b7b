package com.oops.inheritance;

public class Lab420 {
	public static void main(String[] args) {
		Hello3 hello = new Hello3();
		hello.m1();
		hello.m2();

	}

}

class Hai3 {
	int a = 99;

	void m1() {
		System.out.println("Hai->m1 :" + a);
		System.out.println("Hai->m1 :" + b);//'b' is defined in child class, can't be used in parent class
	}
}

class Hello3 extends Hai3 {
	int b = 88;

	void m2() {
		System.out.println("Hello->m2 :" + a);
		System.out.println("Hello->m2 :" + b);
	}
}
