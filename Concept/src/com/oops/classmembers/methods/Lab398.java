package com.oops.classmembers.methods;

public class Lab398 {
	public static void main(String[] args) {
		Hai1 hai = new Hai1();
		hai.a = 99;
		Hello43 h = new Hello43();
		System.out.println("Main begin :" + hai.a);
		h.m1(hai);
		System.out.println("Main ends :" + hai.a);

	}

}

class Hello43 {
	void m1(Hai1 hai) {
		System.out.println("m1 begins :" + hai.a);
		hai=new Hai1();
		hai.a = hai.a + 10;
		System.out.println("m1 ends :" + hai.a);

	}
}

class Hai1 {
	int a;
}

/*
Main begin :99
m1 begins :99
m1 ends :10
Main ends :99*/

