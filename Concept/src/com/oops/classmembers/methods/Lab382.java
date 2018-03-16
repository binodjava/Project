package com.oops.classmembers.methods;

public class Lab382 {
	public static void main(String[] args) {
		Hello29 h=new Hello29();
		int a=h.add(10, 20);
		System.out.println(a);
		h.add(10, 20)

	}
}

class Hello29 {
	int add(int a, int b) {//Duplicate method add(int, int) in type Hello29
		System.out.println("add(int, int)");
		return a + b;
	}

	void add(int a, int b) {//Duplicate method add(int, int) in type Hello29
		System.out.println("add(int, int");
	}

}
