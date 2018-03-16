package com.oops.classmembers.methods;

public class Lab379 {
	public static void main(String[] args) {
		Hello26 h = new Hello26();
		h.show(65);//can't pass direclty int to char
		h.show((char)65);
	}

}

class Hello26 {
	void show(char x) {
		System.out.println("show(char)");

	}
}