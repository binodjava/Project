package com.oops.classmembers.methods;

public class Lab376 {
	public static void main(String[] args) {
		Hello24 h = new Hello24();
		h.show(12);// we're assigning int value to byte
		// h.show((byte)12);
		byte b = 12;
		h.show(b);
	}

}

class Hello24 {
	void show(byte x) {
		System.out.println("show(byte)");
	}
}