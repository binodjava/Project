package com.oops.classmembers.methods;

public class Lab365 {
	public static void main(String[] args) {
		Hello14 h = new Hello14();
		h.show(10);
		System.out.println("Hello");
	}

}

class Hello14 {
	int show(int x) {// This method must return a result of type int
		System.out.println("show()");
		return;
		// return is empty return type, with void also we can use return type
//		return means nothing, just only control is gets returned not any values
	}
}
