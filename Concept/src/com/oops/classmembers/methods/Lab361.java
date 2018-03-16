package com.oops.classmembers.methods;

public class Lab361 {
	public static void main(String[] args) {
		Hello10 h = new Hello10();
		System.out.println(h.show(10));//11
	}

}

class Hello10 {
	int show(int x) {
		return x + 1;
	}
}