package com.oops.classmembers.methods;

public class Lab388 {
	public static void main(String[] args) {
		Hello35 h = new Hello35();
		byte b = 20;
		h.add(b, 10);
		h.add(10, b);

	}

}

class Hello35 {
	void add(byte a, int b) {
		System.out.println("add(byte,int)");
	}

	void add(int a, byte b) {
		System.out.println("add(int,byte)");
	}
}

/*add(byte,int)
add(int,byte)*/
