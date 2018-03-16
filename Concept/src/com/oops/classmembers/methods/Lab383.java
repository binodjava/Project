package com.oops.classmembers.methods;

public class Lab383 {
	public static void main(String[] args) {
		Hello30 h = new Hello30();
		int a = h.add(10, 20);
		System.out.println(a);
		int b = h.add(10, 20, 30);
		System.out.println(b);
	}

}

class Hello30 {
	int add(int a, int b) {
		System.out.println("add(int,int)");
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("add(int,int,int)");
		return a + b + c;
	}
}
/*
add(int,int)
30
add(int,int,int)
60*/
