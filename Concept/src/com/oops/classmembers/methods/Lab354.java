package com.oops.classmembers.methods;

public class Lab354 {
	public static void main(String[] args) {
		Hello7.show();
	}

}

class Hello7 {
	int a;
	static int b;

	static void show() {
		System.out.println(a);//non-static var can't be access through from static context
		
		System.out.println(b);
	}
}
