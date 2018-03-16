package com.oops.classmembers.methods;

public class Lab389 {
	public static void main(String[] args) {
		Hello36 h = new Hello36();
		byte b = 20;
		h.add(b, b)//not matching, have to typecast
		//h.add(b, (int)b);

	}

}

class Hello36 {
	void add(byte a, int b) {
		System.out.println("add(byte,int)");
	}

	void add(int a, byte b) {
		System.out.println("add(int,byte)");
	}
}
