package com.oops.classmembers.methods;

public class Lab397 {
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.a = 99;
		Hello42 h = new Hello42();
		System.out.println("Main begin :" + hai.a);
		h.m1(hai);
		System.out.println("Main begin :" + hai.a);

	}

}

class Hello42 {
	void m1(Hai hai) {
		System.out.println("m1 begins :" + hai.a);
		hai.a = hai.a + 10;
		System.out.println("m1 ends :" + hai.a);

	}
}

class Hai {
	int a;
}

/*Main begin :99
m1 begins :99
m1 ends :109
Main begin :109*/
