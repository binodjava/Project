package com.oops.classmembers.methods;

public class Lab364 {
	public static void main(String[] args) {
		Hello13 h = new Hello13();
		h.show(10);
		System.out.println("hello");
	}

}

class Hello13 {
	int show(int x) {//This method must return a result of type int
		System.out.println("show()");
	}
}
