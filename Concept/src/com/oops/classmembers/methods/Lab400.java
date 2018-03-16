package com.oops.classmembers.methods;

public class Lab400 {
	public static void main(String[] args) {
		Hello45 h = new Hello45();
		h.sum(12, 23);
		h.sum(12, 13, 43);

	}

}


/*
sum(int, int)
35
sum(int, int, int)
68
*/

class Hello45 {
	void sum(int a, int b) {
		System.out.println("sum(int, int)");
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println("sum(int, int, int)");
		System.out.println(a + b + c);

	}
}
