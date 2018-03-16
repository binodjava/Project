package com.oops.classmembers.methods;

public class Lab353 {
	public static void main(String[] args) {
		Hello6 h = new Hello6();
		h.show();
		
	/*	0
		0*/


	}

}

class Hello6 {
	int a;
	static int b;

	void show() {
		System.out.println(a);
		System.out.println(b);
	}
}
