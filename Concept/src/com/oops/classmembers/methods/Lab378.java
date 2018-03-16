package com.oops.classmembers.methods;

public class Lab378 {
	public static void main(String[] args) {
		Hello25 h = new Hello25();
		h.show((byte) 12);//show(char)
	}

}

class Hello25 {
	void show(byte x) {
		System.out.println("show(char)");
	}
}
