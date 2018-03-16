package com.oops.classmembers.methods;

public class Lab405 {
	public static void main(String[] args) {
		Hello50 h = new Hello50();
		h.m1();//ambiguous
//		Both can be called.

	}

}

class Hello50 {
	void m1(int... a) {
		System.out.println("m1(int...)");
	}

	void m1(String... a) {
		System.out.println("m1(String...)");
	}
}