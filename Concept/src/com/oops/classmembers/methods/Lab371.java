package com.oops.classmembers.methods;

public class Lab371 {
	public static void main(String[] args) {
		Hello20 h = new Hello20();
		System.out.println(h.show(10));

	}

}

class Hello20 {
	boolean show(int x) {
		System.out.println("show");
		return false;
		return true;// Unreachable code
	}
}

//can't  be used two return statement
