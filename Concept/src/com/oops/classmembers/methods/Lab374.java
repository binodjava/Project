package com.oops.classmembers.methods;

public class Lab374 {
	public static void main(String[] args) {
		Hello23 h = new Hello23();
		System.out.println(h.show());//need to pass some int value to call method
		System.out.println(h.show(10,20));//need to pass some int value to call method
	
	}

}

class Hello23 {
	int show(int x) {
		System.out.println("show()");
		return x + 1;
	}
}
