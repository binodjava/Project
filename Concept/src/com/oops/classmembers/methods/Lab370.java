package com.oops.classmembers.methods;

public class Lab370 {
	public static void main(String[] args) {
		Hello19 h = new Hello19();
		System.out.println(h.show(10));
	}

}

class Hello19 {
	boolean show(int x) {
		System.out.println("show");
		return 0; // Type mismatch: cannot convert from int to boolean
	}
}
